package fileinputoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TotalNumberOfWords {
    public static void main(String arg[]) throws IOException {

        int count = 0;

        try (FileInputStream finp = new FileInputStream("src/assignment4/textfile")) {

            int i = 0;
            while ((i = finp.read()) != -1) {
                count += 1;
            }

            System.out.print("Word Count: " + count);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
