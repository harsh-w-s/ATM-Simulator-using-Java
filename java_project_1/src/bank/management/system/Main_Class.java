package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Class extends JFrame implements ActionListener {

    String cardNumber;

    JButton deposit, withdraw, fastCash, pinChange, balanceEnquiry, miniStatement, exit;
    Main_Class(String cardNumber) {
        super("Bank Management System");

        this.cardNumber = cardNumber;

        JLabel label1 = new JLabel("Please Select Your Transaction");
        label1.setBounds(430, 180, 700, 35);
        label1.setFont(new Font("Raleway", Font.BOLD, 28));
        label1.setForeground(Color.WHITE);
        add(label1);

        deposit = new JButton("DEPOSIT");
        deposit.setBounds(410, 270, 180, 35);
        deposit.setBackground(new Color(65, 125, 128));
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        add(deposit);

        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(670, 270, 180, 35);
        withdraw.setBackground(new Color(65, 125, 128));
        withdraw.setForeground(Color.WHITE);
        withdraw.addActionListener(this);
        add(withdraw);

        fastCash = new JButton("FAST CASH");
        fastCash.setBounds(410, 320, 180, 35);
        fastCash.setBackground(new Color(65, 125, 128));
        fastCash.setForeground(Color.WHITE);
        fastCash.addActionListener(this);
        add(fastCash);

        pinChange = new JButton("PIN CHANGE");
        pinChange.setBounds(670, 320, 180, 35);
        pinChange.setBackground(new Color(65, 125, 128));
        pinChange.setForeground(Color.WHITE);
        pinChange.addActionListener(this);
        add(pinChange);

        balanceEnquiry = new JButton("BALANCE ENQUIRY");
        balanceEnquiry.setBounds(410, 370, 180, 35);
        balanceEnquiry.setBackground(new Color(65, 125, 128));
        balanceEnquiry.setForeground(Color.WHITE);
        balanceEnquiry.addActionListener(this);
        add(balanceEnquiry);

        miniStatement = new JButton("MINI STATEMENT");
        miniStatement.setBounds(670, 370, 180, 35);
        miniStatement.setBackground(new Color(65, 125, 128));
        miniStatement.setForeground(Color.WHITE);
        miniStatement.addActionListener(this);
        add(miniStatement);

        exit = new JButton("EXIT");
        exit.setBounds(670, 420, 180, 35);
        exit.setBackground(new Color(65, 125, 128));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);  
        add(exit);
        
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
            if(e.getSource() == deposit) {
                new Deposit(cardNumber);
                setVisible(false);
            } else if (e.getSource() == withdraw) {
                new Withdraw(cardNumber);
                setVisible(false);
            } else if (e.getSource() == fastCash) {
                new FastCash(cardNumber);
                setVisible(false);
            } else if (e.getSource() == pinChange) {
                new Pin(cardNumber);
                setVisible(false);
            } else if (e.getSource() == balanceEnquiry) {
                new BalanceEnquiry(cardNumber);
                setVisible(false);
            } else if (e.getSource() == miniStatement) {
                //mini statement
            } else if (e.getSource() == exit) {
                int a = JOptionPane.showConfirmDialog(null, "Do you really want to exit?", "Select", JOptionPane.YES_NO_OPTION);
                if (a == 0) {
                    System.exit(0);
                } else {
                    setVisible(true);
                }
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Main_Class("");
    }
}
