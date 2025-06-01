package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JLabel l2, l3;

    JButton back;

    String cardNumber;

    BalanceEnquiry(String cardNumber) {
        this.cardNumber = cardNumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        
        l2 = new JLabel("Your Current Balance is:");
        l2.setBounds(40, 180, 400, 35);
        l2.setFont(new Font("Raleway", Font.BOLD, 16));
        l2.setForeground(Color.WHITE);
        l1.add(l2);
        
        l3 = new JLabel("2000");
        l3.setBounds(600, 220, 400, 35);
        l3.setFont(new Font("Raleway", Font.BOLD, 16));
        l3.setForeground(Color.WHITE);
        l1.add(l3);

        back = new JButton("BACK");
        back.setBounds(700, 410, 150, 35);
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.setBackground(new Color(65, 125, 128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        l1.add(back);

        String balance = "";
        try {
            Con con = new Con();
            String query = "Select netBalance from bankAccounts where cardNumber  = ?";
            PreparedStatement ps = con.connection.prepareStatement(query);
            ps.setString(1, cardNumber);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                balance = rs.getString("netBalance");
                l3.setText("Rs. " + balance);
            } else {
                l3.setText("No balance found for this card number.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            setVisible(false);
            new Main_Class(cardNumber);
        }
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
