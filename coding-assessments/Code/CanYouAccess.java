public class CanYouAccess {
    public static void main(String[] args) {

        int theTestNumberOne = 24;
        int theTestNumberTwo = 64;

        System.out.println("Is " + theTestNumberOne + " a power of 2: " + isNumberPowerOfTwo(theTestNumberOne));
        System.out.println("Is " + theTestNumberTwo + " a power of 2: " + isNumberPowerOfTwo(theTestNumberTwo));

    }
    public static boolean isNumberPowerOfTwo(int theNumber) {
        if (theNumber == 0)
            return false;
        else
            while (theNumber != 1) {
                if (theNumber % 2 != 0)
                    return false;
                theNumber /= 2;
            }
        return true;
    }
}
