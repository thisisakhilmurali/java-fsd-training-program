public class StringComaprison {
    public static void main(String[] args) {

        String stringOne = "equal";
        String stringTwo = "equal";

        boolean isEqual = checkTheTwoStrings(stringOne, stringTwo);

        System.out.println("Equal ?? : " + isEqual);

    }

    private static boolean checkTheTwoStrings(String stringOne, String stringTwo) {
        if(stringOne.length() != stringTwo.length())
            return false;
        else
            for (int index = 0; index < stringOne.length(); index++)
                if(stringOne.charAt(index) != stringTwo.charAt(index))
                    return false;
            return true;
    }
}