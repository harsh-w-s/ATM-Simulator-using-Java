package bank.management.system;

import java.sql.*;

public class Con {
    Connection connection;
    Statement statement;


    public Con() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingSystem", "root", "Harsh@19");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
