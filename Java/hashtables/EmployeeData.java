package hashtables;

import java.util.HashMap;

public class EmployeeData {
    public static void main(String[] arg) {

        HashMap<String, Employee> employeeDetails = new HashMap<>();

        Employee amitha = new Employee();
        amitha.setEmployeeId(245287);
        amitha.setName("AMB");
        amitha.setAge(25);
        amitha.setDepartment("GTP");

        employeeDetails.put("TVM", amitha);

        System.out.println(employeeDetails.get("TVM"));
        Employee y = employeeDetails.get("TVM");
        System.out.println(y.getEmployeeId());
    }
}
