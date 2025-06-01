package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;


public class SignUp extends JFrame implements ActionListener{

    JTextField textName , textFName, textEmail, textCity, textState, textPin;

    JTextArea textAddress;

    JDateChooser dateChooser;

    JRadioButton radio1, radio2, radio3, radio4, radio5;

    JButton next;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    SignUp(String formno) {
        super("APPLICATION FORM");

        setLayout(null);

        if(formno != "") {
            first = formno;
        }

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(25, 10, 100, 100);
        add(l1);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(140, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1: Personal Details");
        label2.setBounds(330, 70, 600, 30);
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label2);

        JLabel label3 = new JLabel("Name:");
        label3.setBounds(100, 150, 100, 30);
        label3.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label3);

        textName = new JTextField();
        textName.setBounds(300, 150, 400, 30);
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textName);

        JLabel label4 = new JLabel("Father's Name:");
        label4.setBounds(100, 200, 200, 30);
        label4.setFont(new Font("Raleway", Font.BOLD, 20));
        add(label4);

        textFName = new JTextField();
        textFName.setBounds(300, 200, 400, 30);
        textFName.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textFName);

        JLabel textDob = new JLabel("Date of Birth:");
        textDob.setBounds(100, 300, 200, 30);
        textDob.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textDob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 300, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel textGender = new JLabel("Gender:");
        textGender.setBounds(100, 250, 200, 30);
        textGender.setFont(new Font("Raleway", Font.BOLD, 20));
        add(textGender);

        radio1 = new JRadioButton("Male");
        radio1.setBackground(new Color(222, 255, 228));
        radio1.setBounds(300, 250, 60, 30);
        radio1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(radio1);

        radio2 = new JRadioButton("Female");
        radio2.setBackground(new Color(222, 255, 228));
        radio2.setBounds(450, 250, 100, 30);
        radio2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(radio2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radio1);
        buttonGroup.add(radio2);
        
        JLabel labelEmail = new JLabel("Email Address:");
        labelEmail.setBounds(100, 350, 200, 30);
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setBounds(300, 350, 200, 30);
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status:");
        labelMs.setBounds(100, 400, 200, 30);
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelMs);

        radio3 = new JRadioButton("Married");
        radio3.setBackground(new Color(222, 255, 228));
        radio3.setBounds(300, 400, 100, 30);
        radio3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(radio3);

        radio4 = new JRadioButton("Unmarried");
        radio4.setBackground(new Color(222, 255, 228));
        radio4.setBounds(450, 400, 100, 30);
        radio4.setFont(new Font("Raleway", Font.BOLD, 14));
        add(radio4);

        radio5 = new JRadioButton("Other");
        radio5.setBackground(new Color(222, 255, 228));
        radio5.setBounds(600, 400, 100, 30);
        radio5.setFont(new Font("Raleway", Font.BOLD, 14));
        add(radio5);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radio3);
        buttonGroup1.add(radio4);
        buttonGroup1.add(radio5);

        JLabel labelAddress = new JLabel("Address:");
        labelAddress.setBounds(100, 450, 200, 30);
        labelAddress.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelAddress);

        textAddress = new JTextArea();
        textAddress.setBounds(300, 450, 400, 100);
        textAddress.setFont(new Font("Raleway", Font.BOLD, 14));
        textAddress.setLineWrap(true);
        textAddress.setWrapStyleWord(true);
        add(textAddress);

        JLabel labelCity = new JLabel("City:");
        labelCity.setBounds(100, 570, 200, 30);
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelCity);

        textCity = new JTextField();
        textCity.setBounds(300, 570, 200, 30);
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code:");
        labelPin.setBounds(100, 620, 200, 30);
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelPin);

        textPin = new JTextField();
        textPin.setBounds(300, 620, 200, 30);
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textPin);

        JLabel labelState = new JLabel("State:");
        labelState.setBounds(100, 670, 200, 30);
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelState);

        textState = new JTextField();
        textState.setBounds(300, 670, 200, 30);
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textState);

        next = new JButton("Next");
        next.setBounds(620, 730, 80, 30);
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setSize(850, 850);
        setLocation(360, 0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String fnum = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(radio1.isSelected()) {
            gender = "Male";
        } else if(radio2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(radio3.isSelected()) {
            marital = "Married";
        } else if(radio4.isSelected()) {
            marital = "Unmarried";
        } else if(radio5.isSelected()) {
            marital = "Other";
        }
        String address = textAddress.getText();
        String city = textCity.getText();
        String pin = textPin.getText();
        String state = textState.getText();
        
        try {
            if(textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all the required fields");
            } else {    
                System.out.println("Button Clicked");
                Con con = new Con();
                String query = "insert into signup values('"+fnum+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
                con.statement.executeUpdate(query);
                new SignUp2(first);
                setVisible(false);
                System.out.println("Data Inserted");
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp("");
    }
}
