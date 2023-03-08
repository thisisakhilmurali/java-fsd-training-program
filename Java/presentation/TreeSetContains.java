package presentation;

import java.util.TreeSet;

public class TreeSetContains {
    public static void main(String[] ar) {
        TreeSet<String> androidNames = new TreeSet<>();

        androidNames.add("Marshmallow");
        androidNames.add("Oreo");
        androidNames.add("Lollipop");
        androidNames.add("KitKat");
        androidNames.add("Jelly Bean");

        // Contains Function
        boolean isThereKitKat = androidNames.contains("KitKat");
        System.out.println("Do we have KitKat? : " + isThereKitKat);

        boolean isThereFroyo = androidNames.contains("Froyo");
        System.out.println("Do we have Froyo? : " + isThereFroyo);


    }
}
