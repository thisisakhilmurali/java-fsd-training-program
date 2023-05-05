import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {

        // Create students
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Ray", "F", 23));
        studentList.add(new Student("Yash", "M", 23));
        studentList.add(new Student("Ak", "M", 23));
        studentList.add(new Student("Megh", "F", 23));
        studentList.add(new Student("Sow", "F", 23));


        // HashMap to store the Male and Females Separately
        Map<String, List<Student>> map =  studentList.stream()
                .collect(groupingBy(Student::getGender));


        // Print the result

        map.forEach((k, v) -> {
            System.out.println("Gender: " + k);
            v.forEach(student -> {
                System.out.print(student.getName() + ", ");
            });
            System.out.println();

        });




    }
}
