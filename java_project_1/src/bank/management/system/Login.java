package bank.management.system;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;

    JTextField textField;

    JPasswordField passwordField;

    JButton signIn, clear, signUp;

    Login() {
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(350, 10, 100, 100);
        add(l1);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel ll1 = new JLabel(ii3);
        ll1.setBounds(630, 350, 100, 100);
        add(ll1);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(230, 125, 450, 40);
        add(label1);

        label2 = new JLabel("CARD NO:");
        label2.setFont(new Font("Raleway", Font.BOLD, 28));
        label2.setForeground(Color.white);
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        textField = new JTextField(15);
        textField.setBounds(325, 190, 230, 30);
        textField.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField);

        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Raleway", Font.BOLD, 28));
        label3.setForeground(Color.white);
        label3.setBounds(150, 250, 375, 30);
        add(label3);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(325, 250, 230, 30);
        passwordField.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField);

        signIn = new JButton("SIGN IN");
        signIn.setBounds(325, 300, 100, 30);
        signIn.setBackground(Color.white);
        signIn.setForeground(Color.black);
        signIn.setFont(new Font("Arial", Font.BOLD, 14));
        signIn.addActionListener(this);
        add(signIn);

        clear = new JButton("CLEAR");
        clear.setBounds(455, 300, 100, 30);
        clear.setFont(new Font("Arial", Font.BOLD, 14));
        clear.setBackground(Color.white);
        clear.setForeground(Color.black);
        add(clear);

        signUp = new JButton("SIGN UP");
        signUp.setBounds(325, 380, 230, 30);
        signUp.setFont(new Font("Arial", Font.BOLD, 14));
        signUp.setBackground(Color.white);
        signUp.setForeground(Color.black);
        signUp.addActionListener(this);
        add(signUp);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel lll1 = new JLabel(iii3);
        lll1.setBounds(0, 0, 850, 480);
        add(lll1);
        
        setLayout(null);
        setSize(850, 480);
        setLocation(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if( e.getSource() == signIn) {
                Con con = new Con();
                String cardNumber = textField.getText();
                String pin = new String(passwordField.getPassword());

                String query = "select * from signUp3 where cardno = ? and pin = ?";
                PreparedStatement ps = con.connection.prepareStatement(query);

                ps.setString(1, cardNumber);
                ps.setString(2, pin);

                ResultSet rs = ps.executeQuery();

                if(rs.next()) {
                    setVisible(false);
                    new Main_Class(cardNumber);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            }
            else if( e.getSource() == clear ) {
                textField.setText("");
                passwordField.setText("");
            }
            else if( e.getSource() == signUp) {
                setVisible(false);
                new SignUp("");
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new Login();
    }
}
