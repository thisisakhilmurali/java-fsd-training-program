package bubblesortmarkcalculator;

public class MarkCalculator {
    public int calculateMark(int[] array){
        int sum = 0;
        for (int i:array)
            sum += i;
        return sum;
    }
}
