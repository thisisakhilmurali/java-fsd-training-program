package lambdafunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CityFirstLetterFinder {
    public static void main(String[] arg) {
        List<String> myCityLists = Arrays.asList("New York", "Houston", "London", "Helsinki", "Santa Clara", "San Fransisco");
        List<String> startsWithH = myCityLists.stream().filter(val -> val.startsWith("H") || val.startsWith("h")).collect(Collectors.toList());
        System.out.println(startsWithH);
    }
}
