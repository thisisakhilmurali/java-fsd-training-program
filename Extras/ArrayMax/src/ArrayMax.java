public class ArrayMax {
    public static void main(String[] args) {

        int[] myArray = {1, 5, 11, 3, 6};

        int maxNumber = myArray[0];

        for (int index = 1; index < myArray.length; index++) {
            if (myArray[index] > maxNumber)
                maxNumber = myArray[index];
        }

        System.out.println("Largest Number: " + maxNumber);

    }
}