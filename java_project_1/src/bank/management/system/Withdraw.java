package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Withdraw extends JFrame implements ActionListener {
    JTextField amountField;

    JButton withdraw, back;

    String cardNumber;

    Withdraw(String cardNumber) {

        this.cardNumber = cardNumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        JLabel l2 = new JLabel("Enter Amount You Want To Withdraw");
        l2.setBounds(460, 180, 400, 35);
        l2.setFont(new Font("Raleway", Font.BOLD, 16));
        l2.setForeground(Color.WHITE);
        l1.add(l2);

        amountField = new JTextField();
        amountField.setBounds(460, 230, 320, 25);
        amountField.setFont(new Font("Raleway", Font.BOLD, 25));
        amountField.setBackground(new Color(65, 125, 128));
        amountField.setForeground(Color.WHITE);
        l1.add(amountField);
        
        JLabel l3 = new JLabel("(Maximum withdrawal limit is Rs. 10,000)");
        l3.setBounds(460, 270, 400, 35);
        l3.setFont(new Font("Raleway", Font.BOLD, 16));
        l3.setForeground(Color.WHITE);
        l1.add(l3);

        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(700, 362, 150, 35);
        withdraw.setFont(new Font("Raleway", Font.BOLD, 20));
        withdraw.setBackground(new Color(65, 125, 128));
        withdraw.setForeground(Color.WHITE);
        withdraw.addActionListener(this);
        l1.add(withdraw);

        back = new JButton("BACK");
        back.setBounds(700, 406, 150, 35);
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.setBackground(new Color(65, 125, 128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        l1.add(back);

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int amount = Integer.parseInt(amountField.getText());
            Date date = new Date();
            if(e.getSource() == withdraw) {
                if(amount == 0) {
                    JOptionPane.showMessageDialog(null, "Please enter an amount to be deposited");
                } else {
                    Con con = new Con();
                    String query = "insert into transactions values('"+cardNumber+"', '"+date+"', 'Withdraw', '"+amount+"')";
                    con.statement.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Withdrawn Successfully");
                    setVisible(false);
                    new Main_Class(cardNumber);
                }
            } else if(e.getSource() == back) {
                setVisible(false);
                new Main_Class(cardNumber);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Withdraw("");
    }
}
