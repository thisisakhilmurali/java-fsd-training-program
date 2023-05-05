import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Creating student objects

        Student studentOne =  new Student("Ray", "F", 23);
        Student studentTwo =  new Student("Say", "F", 23);
        Student studentThree =  new Student("Tay", "F", 23);
        Student studentFour =  null;
        Student studentFive =  new Student("Uay", "F", 23);
        Student studentSix =  null;
        Student studentSeven =  new Student("Vay", "F", 23);
        Student studentEight =  null;
        Student studentNine =  null;


        List<Student> myList = new ArrayList<>(
                Arrays.asList(
                        studentOne,
                        studentTwo,
                        studentThree,
                        studentFour,
                        studentFive,
                        studentSix,
                        studentSeven,
                        studentEight,
                        studentNine
                )
        );


        // filtering null values
        List<Student> myListOfStudents = myList.stream()
                .filter(student -> student != null).toList();

        myListOfStudents.forEach(val -> {
            System.out.println("Name: " + val.getName());
        });


    }
}
