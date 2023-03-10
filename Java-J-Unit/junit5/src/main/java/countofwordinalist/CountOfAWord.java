package countofwordinalist;

import java.util.ArrayList;
import java.util.List;

public class CountOfAWord {
    public static void main(String[] args) {

        List<String> myAndroidList = new ArrayList<>();
        myAndroidList.add("Marshmallow");
        myAndroidList.add("Oreo");
        myAndroidList.add("Froyo");
        myAndroidList.add("Marshmallow");
        myAndroidList.add("Lollipop");
        myAndroidList.add("Oreo");
        myAndroidList.add("Oreo");

        String theValue = "Oreo";

        System.out.println("Count of " + theValue + ": " + countTheValue(myAndroidList, theValue));
    }

    public static int countTheValue(List<String> myAndroidList, String androidVersion) {
        return (int) myAndroidList.stream().filter(value -> value.equalsIgnoreCase(androidVersion)).count();
    }
}
