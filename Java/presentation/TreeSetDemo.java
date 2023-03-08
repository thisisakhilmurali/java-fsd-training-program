package presentation;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] ar) {

        // TreeSet Creation
        TreeSet<String> androidNames = new TreeSet<>();

        // Adding elements to TreeSet
        androidNames.add("Marshmallow");
        androidNames.add("Oreo");
        androidNames.add("Lollipop");
        androidNames.add("KitKat");
        androidNames.add("Marshmallow");
        androidNames.add("Jelly Bean");

        // Displaying the elements
        System.out.println(androidNames);

        // Displaying the elements -- Iterator (Ascending order)
        System.out.println("\nDisplaying using Iterator");
        Iterator<String> theIterator = androidNames.iterator();
        while (theIterator.hasNext()){
            System.out.println(theIterator.next());
        }

        // Displaying the elements -- Iterator (Descending order)
        System.out.println("\nDisplaying using Iterator (Descending)");
        Iterator<String> myIterator = androidNames.descendingIterator();
        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }
    }
}
