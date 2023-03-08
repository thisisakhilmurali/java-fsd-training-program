package presentation;

import java.util.TreeSet;

public class Homogeneous {
    public static void main(String ar[]){
        TreeSet javascriptFrameworks = new TreeSet ();

        javascriptFrameworks.add("Vue");
        javascriptFrameworks.add("Angular");
        javascriptFrameworks.add("React");
        javascriptFrameworks.add(34);

        System.out.println(javascriptFrameworks);

    }
}
