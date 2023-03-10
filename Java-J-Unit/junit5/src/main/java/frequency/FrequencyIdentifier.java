package frequency;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyIdentifier {
    public static void main(String[] args) {

        List<String> myListOfCellPhones = Arrays.asList(
                "OnePlus", "OnePlus", "Samsung", "Samsung", "Samsung", "Apple", "Nothing"
        );

        Map frequencySet = getFrequencyFromList(myListOfCellPhones);

        System.out.println(frequencySet);

    }
    public static Map getFrequencyFromList(List<String> myList) {
        Map<String, Long> hMap = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return  hMap;
    }
}
