package bank.management.system;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class Pin extends JFrame implements ActionListener {

    JButton changePin, back;

    JPasswordField newPinField, rePinField;
    String cardNumber;

    Pin(String cardNumber) {

        this.cardNumber = cardNumber;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1550, 830);
        add(l1);

        JLabel l2 = new JLabel("CHANGE YOUR PIN");
        l2.setBounds(430, 180, 400, 35);
        l2.setFont(new Font("Raleway", Font.BOLD, 16));
        l2.setForeground(Color.WHITE);
        l1.add(l2);

        JLabel l3 = new JLabel("NEW PIN:");
        l3.setBounds(430, 220, 400, 35);
        l3.setFont(new Font("Raleway", Font.BOLD, 16));
        l3.setForeground(Color.WHITE);
        l1.add(l3);

        newPinField = new JPasswordField();
        newPinField.setBounds(600, 225, 200, 25);
        newPinField.setFont(new Font("Raleway", Font.BOLD, 25));
        newPinField.setBackground(new Color(65, 125, 128));
        newPinField.setForeground(Color.WHITE);
        l1.add(newPinField);

        JLabel l4 = new JLabel("RE-ENTER NEW PIN:");
        l4.setBounds(430, 250, 400, 35);
        l4.setFont(new Font("Raleway", Font.BOLD, 16));
        l4.setForeground(Color.WHITE);
        l1.add(l4);

        rePinField = new JPasswordField();
        rePinField.setBounds(600, 255, 200, 25);
        rePinField.setFont(new Font("Raleway", Font.BOLD, 25));
        rePinField.setBackground(new Color(65, 125, 128));
        rePinField.setForeground(Color.WHITE);
        l1.add(rePinField);

        changePin = new JButton("CHANGE PIN");
        changePin.setBounds(630, 365, 200, 35);
        changePin.setFont(new Font("Raleway", Font.BOLD, 20));
        changePin.setBackground(new Color(65, 125, 128));
        changePin.setForeground(Color.WHITE);
        changePin.addActionListener(this);
        l1.add(changePin);

        back = new JButton("BACK");
        back.setBounds(630, 410, 200, 35);
        back.setFont(new Font("Raleway", Font.BOLD, 20));
        back.setBackground(new Color(65, 125, 128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        l1.add(back);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String newPin = newPinField.getPassword().toString();
            String rePin = rePinField.getPassword().toString();
            if(e.getSource() == changePin) {
                if(newPin.length() != 4 )  {
                    JOptionPane.showMessageDialog(null, "PIN must be 4 digits");
                } else if(newPin != rePin) {
                    JOptionPane.showMessageDialog(null, "PINs do not match");
                } else {
                    Con con = new Con();
                    String query = "UPDATE bankAccounts SET pin = '"+newPin+"' WHERE cardNumber = '"+cardNumber+"'";
                    con.statement.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "PIN changed successfully");
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
        new Pin("");
    }
}
