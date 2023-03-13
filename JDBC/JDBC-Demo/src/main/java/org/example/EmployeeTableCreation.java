package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeTableCreation {
    public static void main(String[] args) {

        final String databaseUrl = "jdbc:mysql://localhost:3306/jdbc_demo";
        final String userName = "*****";
        final String password = "******";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection myConnection = DriverManager.getConnection(databaseUrl, userName, password);

            Statement myStatement = myConnection.createStatement();

            String myQuery = "CREATE TABLE Employee (" +
                            "name VARCHAR(20)," +
                            "age INT," +
                            "department VARCHAR(20)" +
                            ")";

            int resultSet = myStatement.executeUpdate(myQuery);

            System.out.println("EXECUTED SUCCESSFULLY");

            myConnection.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
