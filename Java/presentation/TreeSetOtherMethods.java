package presentation;

import java.util.TreeSet;

public class TreeSetOtherMethods {
    public static void main(String[] ar) {
        TreeSet<String> androidNames = new TreeSet<>();

        androidNames.add("Marshmallow");
        androidNames.add("Oreo");
        androidNames.add("Lollipop");
        androidNames.add("KitKat");
        androidNames.add("Marshmallow");
        androidNames.add("Jelly Bean");

        // Getting the first element
        System.out.println("First Element: " + androidNames.first());
        // Getting the last element
        System.out.println("Last Element: " + androidNames.last());
        // Getting the size of the list
        System.out.println("Size of List: " + androidNames.size());
        // Check if the list is empty or not
        System.out.println("Is List Empty: " + androidNames.isEmpty());

    }

}
