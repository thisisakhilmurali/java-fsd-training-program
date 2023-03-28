
public class MergeArray {
    public static void main(String[] args) {


        int[] firstArray = {21, 52, 31, 94, 45};
        int[] secondArray = {91, 62, 63, 34, 15, 89};

        int[] mergedArray = mergeTheTwoArrays(firstArray, secondArray);
        
        int[] sortedArray = sortTheArrayInDescendingOrder(mergedArray);

        for (int index = 0; index < sortedArray.length; index++)
            System.out.print(sortedArray[index] + " ");
    }

    // Bubble Sort
    private static int[] sortTheArrayInDescendingOrder(int[] mergedArray) {
        int temp_holder = 0;
        for (int indexOuter = 0; indexOuter < mergedArray.length; indexOuter++) {
            for (int indexInner = 1; indexInner < (mergedArray.length - indexOuter); indexInner++) {
                if(mergedArray[indexInner - 1] > mergedArray[indexInner]) {
                    temp_holder = mergedArray[indexInner - 1];
                    mergedArray[indexInner - 1] = mergedArray[indexInner];
                    mergedArray[indexInner] = temp_holder;
                }
            }
        }

        return mergedArray;
    }

    // Merging Two Arrays
    private static int[] mergeTheTwoArrays(int[] firstArray, int[] secondArray) {

        int[] mergedArray = new int[firstArray.length + secondArray.length];

        for (int index = 0; index < firstArray.length; index++)
            mergedArray[index] = firstArray[index];

        for (int index = firstArray.length, secondIndex = 0; index < mergedArray.length; index++, secondIndex++)
            mergedArray[index] = secondArray[secondIndex];

        return mergedArray;
    }
}