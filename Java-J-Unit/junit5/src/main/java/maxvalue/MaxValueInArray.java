package maxvalue;

public class MaxValueInArray {
    public static void main(String[] ar) {

        int theArray[] = {1, 2, 3, 65, 4, 5};
        System.out.println(maxElement(theArray));
    }

    public static int maxElement(int myArray[]) {
        int currentMax = myArray[0];
        for(int index = 1; index < myArray.length; index++)
            if(myArray[index] > currentMax)
                currentMax = myArray[index];
        return currentMax;
    }
}
