import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DatabaseUpdation {

    static final String databaseUrl = "jdbc:mysql://localhost:3306/demo_training";
    static final String userName = "******";
    static final String passWord = "******";

    public static void updateCandidateDetails(Employee emp) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection myConnection = DriverManager.getConnection(databaseUrl, userName, passWord);

            Statement myStatement = myConnection.createStatement();

            String myQuery = "INSERT INTO employee (eid, name, email, phone_number, address, location, salary) VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = myConnection.prepareStatement(myQuery);
            preparedStatement.setString(1, emp.getEmployeeId());
            preparedStatement.setString(2, emp.getName());
            preparedStatement.setString(3, emp.getEmailId());
            preparedStatement.setString(4, emp.getPhoneNumber());
            preparedStatement.setString(5, emp.getAddressPresent());
            preparedStatement.setString(6, emp.getLocation());
            preparedStatement.setDouble(7, emp.getSalary());

            preparedStatement.execute();

            System.out.println("RECORD INSERTED SUCCESSFULLY");

            myConnection.close();


        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
