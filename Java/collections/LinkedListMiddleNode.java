package collections;
import java.util.*;
public class LinkedListMiddleNode {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        LinkedList<String> myListOfFruits = new LinkedList<String>();

        for(int index = 0; index < 7; index++) {
            System.out.print("Enter the Element ("+ (index + 1) +"): ");
            myListOfFruits.add(sc.next());
        }

        System.out.println("Size of linked list: " + myListOfFruits.size());
        System.out.print("Middle Node: " + myListOfFruits.get(myListOfFruits.size()/2));

    }
}
