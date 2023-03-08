package javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamDemo {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] arg) throws IOException {
        FileInputStream finput = null;
        try {
            finput = new FileInputStream("src/javaio/DemoFile");
            int i = 0;
            while ((i = finput.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            finput.close();
        }
    }
}
