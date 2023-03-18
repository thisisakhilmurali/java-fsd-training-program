package linkedlist;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class NthLargestElement {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        LinkedList<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.add(10);
        myLinkedList.add(30);
        myLinkedList.add(60);
        myLinkedList.add(20);
        myLinkedList.add(40);
        myLinkedList.add(50);
        myLinkedList.add(80);
        myLinkedList.add(70);

        myLinkedList
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        int value = myLinkedList
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(k-1)
                .limit(1)
                .findFirst()
                .orElse(0);

        System.out.println("\nLargest: " + value);

    }
}
