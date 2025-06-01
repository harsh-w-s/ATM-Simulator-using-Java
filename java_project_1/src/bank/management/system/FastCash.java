package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton f1, f2, f3, f4, f5, f6, back;

    String cardNumber;

    FastCash(String cardNumber) {
        this.cardNumber = cardNumber;

        JLabel label1 = new JLabel("SELECT WITHDRAWAL AMOUNT");
        label1.setBounds(450, 180, 700, 35);
        label1.setFont(new Font("Raleway", Font.BOLD, 23));
        label1.setForeground(Color.WHITE);
        add(label1);

        f1 = new JButton("100");
        f1.setBounds(410, 270, 150, 35);
        f1.setBackground(new Color(65, 125, 128));
        f1.setForeground(Color.WHITE);
        f1.addActionListener(this);
        add(f1);

        f2 = new JButton("500");
        f2.setBounds(670, 270, 180, 35);
        f2.setBackground(new Color(65, 125, 128));
        f2.setForeground(Color.WHITE);
        f2.addActionListener(this);
        add(f2);

        f3 = new JButton("1000");
        f3.setBounds(410, 320, 150, 35);
        f3.setBackground(new Color(65, 125, 128));
        f3.setForeground(Color.WHITE);
        f3.addActionListener(this);
        add(f3);

        f4 = new JButton("2000");
        f4.setBounds(670, 320, 180, 35);
        f4.setBackground(new Color(65, 125, 128));
        f4.setForeground(Color.WHITE);
        f4.addActionListener(this);
        add(f4);

        f5 = new JButton("5000");
        f5.setBounds(410, 370, 150, 35);
        f5.setBackground(new Color(65, 125, 128));
        f5.setForeground(Color.WHITE);
        f5.addActionListener(this);
        add(f5);

        f6 = new JButton("10000");
        f6.setBounds(670, 370, 180, 35);
        f6.setBackground(new Color(65, 125, 128));
        f6.setForeground(Color.WHITE);
        f6.addActionListener(this);
        add(f6);

        back = new JButton("BACK");
        back.setBounds(670, 420, 180, 35);
        
        back.setBackground(new Color(65, 125, 128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);  
        add(back);
        

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        setLayout(null);
        setSize(1550, 830);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = ((JButton) e.getSource()).getText();
            Date date = new Date();
            if(e.getSource() == back) {
                setVisible(false);
                new Main_Class(cardNumber);
            } else {
                Con con = new Con();
                String query = "insert into transactions values('"+cardNumber+"', '"+date+"', 'Withdraw', '"+amount+"')";
                con.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Withdrawn Successfully");
                setVisible(false);
                new Main_Class(cardNumber);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
