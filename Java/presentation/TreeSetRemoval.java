package presentation;

import java.util.TreeSet;

public class TreeSetRemoval {
    public static void main(String ar[]) {
        TreeSet<String> androidNames = new TreeSet<>();

        androidNames.add("Marshmallow");
        androidNames.add("Oreo");
        androidNames.add("Lollipop");
        androidNames.add("KitKat");
        androidNames.add("Marshmallow");
        androidNames.add("Jelly Bean");

        // Entry Removal
        androidNames.remove("KitKat");

        System.out.println(androidNames);

        // Clear The Whole List
        androidNames.clear();

        System.out.println(androidNames);
    }
}
