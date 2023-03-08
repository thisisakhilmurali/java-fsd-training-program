package bubblesortmarkcalculator;

/*
* Calc total marks of students ------
* Sort array total marks on bubble sort -----
* Assign Ranks
* Print the mark
*/

public class Main {

    public static void main(String arg[]) {

        String[] students = {"Alice", "Bob", "Charlie", "David", "Eva"};
        int [][] marks = {
                {80, 75, 90},
                {85, 70, 95},
                {90, 80, 85},
                {75, 85, 90},
                {95, 90, 80}
        };

        // Total Mark Calculation
        int totalMarks[] = new int[5];
        MarkCalculator mk = new MarkCalculator();

        for (int i = 0; i < marks.length; i++) {
            totalMarks[i] = mk.calculateMark(marks[i]);
        }

        int indexOfNames[] = {0, 1, 2, 3, 4};

        // Bubble Sort - Descending
        BubbleSort bs = new BubbleSort();
//        bs.bubbleSort(totalMarks, indexOfNames);

        for (int i:totalMarks) {
            System.out.println(i);
        }
    }
}
