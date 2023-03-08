package javaio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class FileOutputStreamDemo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] ar) throws IOException {

        try (FileOutputStream fout = new FileOutputStream("src/javaio/DemoFile")) {
            System.out.print("Enter the Data: ");
            fout.write(sc.nextLine().getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
