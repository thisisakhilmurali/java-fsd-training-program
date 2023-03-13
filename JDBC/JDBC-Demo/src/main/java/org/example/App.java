package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main( String[] args ) {

        String databaseUrl = "jdbc:mysql://localhost:3306/carrentalinformation";
        String userName = "*******";
        String password = "*******";

        try{

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(databaseUrl, userName, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from owners");

            while(rs.next())
                System.out.println(
                                rs.getString(1) + "  "
                                + rs.getString(2) + "  "
                                + rs.getString(3) + "  "
                                + rs.getString(4) + "  "
                                + rs.getString(5)
                );
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
