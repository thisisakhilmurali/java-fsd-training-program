package fileinputoutputstream;

import java.io.FileOutputStream;
import java.util.Scanner;

public class SettingThePath {
    static Scanner sc = new Scanner(System.in);

    public static void main(String arg[]) {
        try {
            System.out.print("Enter the path name: ");
            String pathName = sc.nextLine();

            System.out.print("Enter the data: ");
            String writeData = sc.nextLine();

            FileOutputStream fout = new FileOutputStream(pathName);
            fout.write(writeData.getBytes());
            fout.close();

        } catch (Exception e) {
            System.out.print(e);
        }
    }
}