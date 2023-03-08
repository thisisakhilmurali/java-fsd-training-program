package collections;

import java.util.*;
public class ArrayCommonElements {
    public static void findCommonElements(int[] arrayOne, int[] arrayTwo) {
        Set<Integer> setOne = new HashSet<>();
        Set<Integer> setTwo = new HashSet<>();

        for (int element: arrayOne)
            setOne.add(element);

        for (int element: arrayTwo)
            setTwo.add(element);

        setOne.retainAll(setTwo);

        System.out.println("Common Elements: " + setOne);

    }
    public static void main(String[] ar) {

        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayTwo = {2, 4, 6, 8, 10, 12, 14, 16};

        System.out.println("First Array: " + Arrays.toString(arrayOne));
        System.out.println("Second Array: " + Arrays.toString(arrayTwo));

        findCommonElements(arrayOne, arrayTwo);

    }
}