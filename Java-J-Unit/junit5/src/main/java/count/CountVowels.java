package count;

public class CountVowels {
    public static void main(String[] args) {
        String inputString = "akhil";
        System.out.println("Vowel Count: " + vowelsCount(inputString));
    }

    public static int vowelsCount(String inputString) {
        int vowelCount = 0;

        for (int index = 0; index < inputString.length(); index++) {
            char c = Character.toLowerCase(inputString.charAt(index));
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                vowelCount++;
        }

        return vowelCount;
    }
}
