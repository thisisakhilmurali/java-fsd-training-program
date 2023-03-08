package hashtables;

import java.util.HashMap;
import java.util.Scanner;

public class HashTable {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg) {
        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("JellyBean", 4);
        myMap.put("Kit Kat", 5);
        myMap.put("Lollipop", 6);
        myMap.put("Marshmallow", 7);

        int version = myMap.get("Kit Kat");
        System.out.println("Android Version of KitKat is " + version);

        boolean containsMarshmallow = myMap.containsKey("Marshmallow");
        System.out.print("Do we have Marshmallow: " + containsMarshmallow);

        myMap.remove("Lollipop");

        System.out.println();

        for(String keyInMap: myMap.keySet()) {
            System.out.println(myMap.get(keyInMap));
        }

        System.out.println("Hash Code: " + myMap.hashCode());
    }
}
