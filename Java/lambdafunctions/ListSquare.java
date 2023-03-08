package lambdafunctions;

import java.util.*;
import java.util.stream.Collectors;

public class ListSquare {
    public static void main(String[] arg) {
        List<Integer> myList = Arrays.asList(2, 3, 4, 5, 6);

        List<Integer> squaredValues = myList.stream().filter(valT -> valT%2 == 0).map(val -> val*val).collect(Collectors.toList());

        System.out.println(squaredValues);
    }
}
