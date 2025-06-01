package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp3 extends JFrame implements ActionListener{

    JRadioButton r1, r2, r3, r4;

    JCheckBox c1, c2, c3, c4, c5, c6, c7, c8;

    JButton submit, cancel;

    String formno;
    SignUp3(String formno) {
        super("APPLICATION FORM");

        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(150, 5, 100, 100);
        add(l1);

        JLabel label1 = new JLabel("APPLICATION FORM NO. " + formno);
        label1.setBounds(300, 30, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label1);

        JLabel label2 = new JLabel("Page 3: Account Details");
        label2.setBounds(300, 70, 600, 30);
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label2);

        JLabel label3 = new JLabel("Account Type:");
        label3.setBounds(100, 150, 200, 30);
        label3.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label3);

        r1 = new JRadioButton("Saving Account");
        r1.setBounds(100, 180, 150, 30);
        r1.setBackground(new Color(215, 252, 252));
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBounds(350, 180, 200, 30);
        r2.setBackground(new Color(215, 252, 252));
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r2);

        r3 = new JRadioButton("Recurring Deposit Account");
        r3.setBounds(100, 220, 200, 30);
        r3.setBackground(new Color(215, 252, 252));
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r3);

        r4 = new JRadioButton("Current Account");
        r4.setBounds(350, 220, 150, 30);
        r4.setBackground(new Color(215, 252, 252));
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r4);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        JLabel label4 = new JLabel("Card Number:");
        label4.setBounds(100, 280, 200, 30);
        label4.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label4);

        JLabel label5 = new JLabel("XXXX-XXXX-XXXX-1234");
        label5.setBounds(350, 280, 250, 30);
        label5.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label5);

        JLabel label6 = new JLabel("(Your 16 Digit Card Number)");
        label6.setBounds(100, 310, 300, 30);
        label6.setFont(new Font("Raleway", Font.BOLD, 14));
        add(label6);

        JLabel label7 = new JLabel("(It would appear on ATM Card/Cheque Book and Statements)");
        label7.setBounds(350, 310, 450, 30);
        label7.setFont(new Font("Raleway", Font.BOLD, 14));
        add(label7);

        JLabel label8 = new JLabel("PIN:");
        label8.setBounds(100, 360, 200, 30);
        label8.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label8);

        JLabel label9 = new JLabel("XXXX");
        label9.setBounds(350, 360, 200, 30);
        label9.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label9);

        JLabel label10 = new JLabel("(Your 4 Digit Password)");
        label10.setBounds(100, 390, 300, 30);
        label10.setFont(new Font("Raleway", Font.BOLD, 14));
        add(label10);

        JLabel label11 = new JLabel("Services Required:");
        label11.setBounds(100, 440, 200, 30);
        label11.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBounds(100, 480, 150, 30);
        c1.setBackground(new Color(215, 252, 252));
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBounds(350, 480, 150, 30);
        c2.setBackground(new Color(215, 252, 252));
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBounds(100, 520, 150, 30);
        c3.setBackground(new Color(215, 252, 252));
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(c3);

        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setBounds(350, 520, 200, 30);
        c4.setBackground(new Color(215, 252, 252));
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBounds(100, 560, 150, 30);
        c5.setBackground(new Color(215, 252, 252));
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBounds(350, 560, 150, 30);
        c6.setBackground(new Color(215, 252, 252));
        c6.setFont(new Font("Raleway", Font.BOLD, 14));
        add(c6);

        c7 = new JCheckBox("I declare that the above entered details are correct to the best of my knowledge.");
        c7.setBounds(100, 620, 500, 30);
        c7.setBackground(new Color(215, 252, 252));
        c7.setFont(new Font("Raleway", Font.BOLD, 14));
        add(c7);

        c8 = new JCheckBox("I hereby agree to the Terms and Conditions of the Bank.");
        c8.setBounds(100, 660, 500, 30);
        c8.setBackground(new Color(215, 252, 252));
        c8.setFont(new Font("Raleway", Font.BOLD, 14));
        add(c8);

        submit = new JButton("Next");
        submit.setBounds(570, 700, 100, 30);
        submit.setBackground(new Color(0, 0, 0));
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(450, 700, 100, 30);
        cancel.setBackground(new Color(0, 0, 0));
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(new java.awt.Color(215, 252, 252));
        setSize(850, 800);
        setLayout(null);
        setLocation(350, 20);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accountType = null;
        if(r1.isSelected()) {
            accountType = "Saving Account";
        } else if(r2.isSelected()) {
            accountType = "Fixed Deposit Account";
        } else if(r3.isSelected()) {
            accountType = "Recurring Deposit Account";
        } else if(r4.isSelected()) {
            accountType = "Current Account";
        }
        
        Random random = new Random();
        long first7 = (random.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (random.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        int initialBalance = 0;

        String services = "";
        if(c1.isSelected()) {
            services += "ATM CARD";
        }
        if(c2.isSelected()) {
            services += " Internet Banking";
        }
        if(c3.isSelected()) {
            services += " Mobile Banking";
        }
        if(c4.isSelected()) {
            services += " Email & SMS Alerts";
        }
        if(c5.isSelected()) {
            services += " Cheque Book";
        }
        if(c6.isSelected()) {
            services += " E-Statement";
        }

        try {
            if(e.getSource() == submit) {
                if(accountType == null) {
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                }
                else if (!c7.isSelected() || !c8.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Please agree to the terms and conditions");
                } else {
                    System.out.println("Submitted");
                    Con con = new Con();
                    String query = "INSERT INTO signUp3 VALUES('"+formno+"', '"+accountType+"', '"+cardno+"', '"+pin+"', '"+services+"')";
                    String query1 = "INSERT INTO bankAccounts VALUES('"+cardno+"', '"+pin+"', '"+initialBalance+"')";
                    con.statement.executeUpdate(query);
                    con.statement.executeUpdate(query1);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\nPin: " + pin);
                    setVisible(false);
                    new Deposit(cardno);
                }
            }
            else if(e.getSource() == cancel) {
                setVisible(false);
                new Login();
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new SignUp3("");
    }
}
