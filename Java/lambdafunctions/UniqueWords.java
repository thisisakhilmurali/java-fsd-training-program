package lambdafunctions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UniqueWords {
    public static void main(String[] ar) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student article: ");
        String article = sc.nextLine();

        String[] articleToWordArray = article.split("[,:;.?! ]");

        List<String> theWords = Arrays.stream(articleToWordArray)
                .filter(val -> !val.isEmpty())
                .collect(Collectors.toList());

        List<String> uniqueWords = theWords.stream()
                .map(val -> val.toLowerCase())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Number of Words: " + theWords.size());
        System.out.println("Number of unique words: " + uniqueWords.size());

        System.out.println(uniqueWords);
    }
}
