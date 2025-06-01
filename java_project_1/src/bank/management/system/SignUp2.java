package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener {

    JComboBox<String> comboBox1, comboBox2, comboBox3, comboBox4, comboBox5;

    JTextField textPan, textAadhar;

    JRadioButton r1, r2, r3, r4;

    JButton next, back;

    String formno;

    SignUp2(String first) {
        super("APPLICATION FORM");

        formno = first;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(150, 5, 100, 100);
        add(l1);

        JLabel label1 = new JLabel("APPLICATION FORM NO. " + first);
        label1.setBounds(300, 30, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label1);

        JLabel label2 = new JLabel("Page 2: Additional Details");
        label2.setBounds(300, 70, 600, 30);
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label2);

        JLabel label3 = new JLabel("Religion:");
        label3.setBounds(100, 150, 100, 30);
        label3.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label3);

        String[] religions = {"Hindu", "jain", "Muslim", "Christian", "Sikh", "Other"};
        comboBox1 = new JComboBox<String>(religions);
        comboBox1.setBounds(350, 150, 320, 30);
        comboBox1.setBackground(new Color(252, 208, 76));
        comboBox1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox1);

        JLabel label4 = new JLabel("Category:");
        label4.setBounds(100, 200, 100, 30);
        label4.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label4);

        String[] categories = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox<String>(categories);
        comboBox2.setBounds(350, 200, 320, 30);
        comboBox2.setBackground(new Color(252, 208, 76));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox2);

        JLabel label5 = new JLabel("Income:");
        label5.setBounds(100, 250, 100, 30);
        label5.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label5);

        String[] incomes = {"Null", "Less than 1 Lakh", "1 Lakh - 2 Lakh", "2 Lakh - 5 Lakh", "More than 5 Lakh"};
        comboBox3 = new JComboBox<String>(incomes);
        comboBox3.setBounds(350, 250, 320, 30);
        comboBox3.setBackground(new Color(252, 208, 76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox3);

        JLabel label6 = new JLabel("Educational:");
        label6.setBounds(100, 300, 200, 30);
        label6.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label6);

        String[] education = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"};
        comboBox4 = new JComboBox<String>(education);
        comboBox4.setBounds(350, 300, 320, 30);
        comboBox4.setBackground(new Color(252, 208, 76));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox4);

        JLabel label7 = new JLabel("Occupation:");
        label7.setBounds(100, 350, 200, 30);
        label7.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label7);

        String[] occupations = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        comboBox5 = new JComboBox<String>(occupations);
        comboBox5.setBounds(350, 350, 320, 30);
        comboBox5.setBackground(new Color(252, 208, 76));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        add(comboBox5);

        JLabel label8 = new JLabel("PAN Number:"); 
        label8.setBounds(100, 400, 200, 30);
        label8.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label8);

        textPan = new JTextField();
        textPan.setBounds(350, 400, 320, 30);
        textPan.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textPan);

        JLabel label9 = new JLabel("Aadhar Number:");
        label9.setBounds(100, 450, 200, 30);
        label9.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label9);

        textAadhar = new JTextField();
        textAadhar.setBounds(350, 450, 320, 30);
        textAadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        add(textAadhar);

        JLabel label10 = new JLabel("Senior Citizen:");
        label10.setBounds(100, 500, 200, 30);
        label10.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label10);

        r1 = new JRadioButton("Yes");
        r1.setBounds(350, 500, 100, 30);
        r1.setBackground(new Color(252, 208, 76));
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r1);

        r2 = new JRadioButton("No");
        r2.setBounds(500, 500, 100, 30);
        r2.setBackground(new Color(252, 208, 76));
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel label11 = new JLabel("Existing Account:");
        label11.setBounds(100, 550, 200, 30);
        label11.setFont(new Font("Raleway", Font.BOLD, 18));
        add(label11);

        r3 = new JRadioButton("yes");
        r3.setBounds(350, 550, 100, 30);
        r3.setBackground(new Color(252, 208, 76));
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r3);

        r4 = new JRadioButton("No");
        r4.setBounds(500, 550, 100, 30);
        r4.setBackground(new Color(252, 208, 76));
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        next = new JButton("Next");
        next.setBounds(570, 620, 100, 30);
        next.setBackground(new Color(0, 0, 0));
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.addActionListener(this);
        add(next);

        back = new JButton("Back");
        back.setBounds(450, 620, 100, 30);
        back.setBackground(new Color(0, 0, 0));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Raleway", Font.BOLD, 14));
        back.addActionListener(this);
        add(back);


        setLayout(null);
        setSize(850, 750);
        setLocation(350, 50);
        getContentPane().setBackground(new Color(252, 208, 76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        String religion = (String) comboBox1.getSelectedItem();
        String category = (String) comboBox2.getSelectedItem();
        String income = (String) comboBox3.getSelectedItem();
        String education = (String) comboBox4.getSelectedItem();
        String occupation = (String) comboBox5.getSelectedItem();
        String pan = textPan.getText();
        String aadhar = textAadhar.getText();
        String seniorCitizen = null;
        if(r1.isSelected()) {
            seniorCitizen = "Yes";
        } else if(r2.isSelected()) {
            seniorCitizen = "No";
        }
        String existingAccount = null;
        if(r3.isSelected()) {
            existingAccount = "Yes";
        } else if(r4.isSelected()) {
            existingAccount = "No";
        }
        if(e.getSource() == next) {
            try {
                Con con = new Con();
                String query = "INSERT INTO signUp2 VALUES('" + formno + "', '" + religion + "', '" + category + "', '" + income + "', '" + education + "', '" + occupation + "', '" + pan + "', '" + aadhar + "', '" + seniorCitizen + "', '" + existingAccount + "')";
                con.statement.executeUpdate(query);
                setVisible(false);
                new SignUp3(formno);
                System.out.println("Data Inserted Successfully");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if(e.getSource() == back) {
            setVisible(false);
            new SignUp(formno);
        }
        }
    
    public static void main(String[] args) {
        new SignUp2("");
    }
}