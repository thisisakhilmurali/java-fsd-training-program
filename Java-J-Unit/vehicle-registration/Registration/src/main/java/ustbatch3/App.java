package ustbatch3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main( String[] args ) {

        String registrationNumber = "KL01T1234";
        List<String> theStateAndDistrict = findStateAndDistrict(registrationNumber);

    }

    public static List<String> findStateAndDistrict(String registrationNumber) {

        HashMap<String, String> stateCodeToState = new HashMap<>();
        stateCodeToState.put("KL", "Kerala");
        stateCodeToState.put("TN", "Tamil Nadu");
        stateCodeToState.put("KA", "Karnataka");

        HashMap<String, String> keralaState = new HashMap<>();
        keralaState.put("01", "Trivandrum");
        keralaState.put("02", "Kollam");
        keralaState.put("03", "Pathanamthitta");

        HashMap<String, String> tamilnaduState = new HashMap<>();
        tamilnaduState.put("01", "Chennai");
        tamilnaduState.put("02", "Coimbatore-North");
        tamilnaduState.put("03", "Tiruppur");

        HashMap<String, String> karnatakaState = new HashMap<>();
        karnatakaState.put("01", "Koramangala");
        karnatakaState.put("02", "Rajajinagar");
        karnatakaState.put("03", "Indiranagar");

        String stateCode = registrationNumber.substring(0, 2);

        List<String> myList = new ArrayList<>();

        boolean containsStateCode = stateCodeToState.containsKey(stateCode);

        if(containsStateCode) {

            if(stateCode.equalsIgnoreCase("KL")){

                String stateNumber = registrationNumber.substring(2, 4);
                Boolean containsStateNumber = keralaState.containsKey(stateNumber);

                if(containsStateNumber) {
                    myList.add(stateCodeToState.get(stateCode));
                    myList.add(keralaState.get(stateNumber));
                }

            } else if (stateCode.equalsIgnoreCase("TN")) {
                String stateNumber = registrationNumber.substring(2, 4);
                Boolean containsStateNumber = tamilnaduState.containsKey(stateNumber);

                if(containsStateNumber) {
                    myList.add(stateCodeToState.get(stateCode));
                    myList.add(tamilnaduState.get(stateNumber));
                }

            } else if (stateCode.equalsIgnoreCase(("KA"))) {

                String stateNumber = registrationNumber.substring(2, 4);
                Boolean containsStateNumber = karnatakaState.containsKey(stateNumber);

                if(containsStateNumber) {
                    myList.add(stateCodeToState.get(stateCode));
                    myList.add(karnatakaState.get(stateNumber));
                }
            }
        }

        return myList;
    }
}