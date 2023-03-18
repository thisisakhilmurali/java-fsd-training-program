package org.employee;

import java.sql.*;

public class DatabaseUpdation {

    private static final String databaseUrl = "jdbc:mysql://localhost:3306/demo_training";
    private static final String userName = "root";
    private static final String passWord = "pass@word1";
    private static final String driver = "com.mysql.cj.jdbc.Driver";

    public static void updateCandidateDetails(Employee emp) {

        PreparedStatement preparedStatement = null;
        Connection myConnection = null;

        try {

            Class.forName(driver);

            myConnection = DriverManager.getConnection(databaseUrl, userName, passWord);

            Statement myStatement = myConnection.createStatement();

            String myQuery = "INSERT INTO employee" +
                    " (eid, name, email, phone_number, address, location, salary) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";

            preparedStatement = myConnection.prepareStatement(myQuery);
            preparedStatement.setString(1, emp.getEmployeeId());
            preparedStatement.setString(2, emp.getName());
            preparedStatement.setString(3, emp.getEmailId());
            preparedStatement.setString(4, emp.getPhoneNumber());
            preparedStatement.setString(5, emp.getAddressPresent());
            preparedStatement.setString(6, emp.getLocation());
            preparedStatement.setDouble(7, emp.getSalary());

            preparedStatement.execute();

            System.out.println("\nRECORD INSERTED SUCCESSFULLY");

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {

            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (myConnection != null) {
                    myConnection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
