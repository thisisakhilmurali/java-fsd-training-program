import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern patternObject = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        int numberOfSentences = Integer.parseInt(in.nextLine());

        while (numberOfSentences-- > 0) {

            String inputSentence = in.nextLine();

            Matcher matcherObject = patternObject.matcher(inputSentence);

            while (matcherObject.find()) {
                inputSentence = inputSentence.replaceAll(matcherObject.group(), matcherObject.group(1));

            }

            System.out.println(inputSentence);
        }
    }
}