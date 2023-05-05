package user;

import java.util.HashMap;
import java.util.Scanner;

public class UserLookUp {

    public static void main(String[] args) {

        HashMap<String, User> theUserHashMap = initiateTheUsers();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the username to search: ");
        String theUserName = scanner.nextLine();

        boolean isAValidUser = searchForTheUserName(theUserHashMap, theUserName);

        if (isAValidUser) {
            User user = theUserHashMap.get(theUserName);
            System.out.println("FirstName: " + user.getFirstName());
            System.out.println("LastName: " + user.getLastName());
            System.out.println("Age: " + user.getAge());
            System.out.println("Location: " + user.getLocation());
        }
        else {
            System.out.println("User Not Found");
        }

    }

    private static boolean searchForTheUserName(HashMap<String, User> theUserHashMap, String theUserName) {
        return theUserHashMap.containsKey(theUserName);
    }

    private static HashMap<String, User> initiateTheUsers() {

        HashMap<String, User> userHashMap = new HashMap<>();

        userHashMap.put(
                "alexsmith",
                new User("Alex", "Smith", 23, "Maryland")
        );

        userHashMap.put(
                "maryclark",
                new User("Mary", "Clark", 28, "San Jose")
        );

        userHashMap.put(
                "davidjohnson",
                new User("David", "Johnson", 25, "San Francisco")
        );

        userHashMap.put(
                "johncampbell",
                new User("John", "Campbell", 24, "Manhattan")
        );

        userHashMap.put(
                "zeddjohn",
                new User("John", "Zedd", 32, "Queens")
        );

        return userHashMap;
    }

}
