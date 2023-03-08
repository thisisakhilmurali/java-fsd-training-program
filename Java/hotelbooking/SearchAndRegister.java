package hotelbooking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchAndRegister {
    public static void main(String[] ar) {

        Scanner sc = new Scanner(System.in);

        // Hotel Details Entering
        Hotel ginger = new Hotel("1001", "Ginger Hotel", "Kazhakkoottam", 3500.00);
        Hotel karthika = new Hotel("1002","Karthika Hotel", "Kazhakkoottam", 2700.00);
        Hotel flamingo = new Hotel("1003","Flamingo Hotel", "Kulathoor", 1700.00);
        Hotel bedPods = new Hotel("1004","Bed Pods", "kulathoor", 1200.00);
        Hotel horizon = new Hotel("1005","Horizon Hotel", "Thampanoor", 1700.00);
        Hotel maybeline = new Hotel("1006","Maybeline", "Thampanoor", 1800.00);


        // Hotel List Creation
        List<Hotel> myHotelList = new ArrayList<>();
        myHotelList.add(ginger);
        myHotelList.add(karthika);
        myHotelList.add(flamingo);
        myHotelList.add(bedPods);
        myHotelList.add(horizon);
        myHotelList.add(maybeline);

        System.out.println("\nHOTEL BOOKING ONLINE\nLocation: Trivandrum");
        System.out.print("\nEnter the Minimum price: ");
        int minPrice = sc.nextInt();
        System.out.print("Enter the Maximum price: ");
        int maxPrice = sc.nextInt();


        // Hotels filtering based on Price
        List<Hotel> filterHotel = myHotelList.stream()
                .filter(val -> (val.getPriceForADay() >= minPrice && val.getPriceForADay() <= maxPrice))
                .toList();

        if(filterHotel.isEmpty()){
            System.out.println("No Hotel Found in the price range");
        }
        else{
            // Search results
            System.out.println("\nSearch Results in \"Trivandrum\"");

            for(Hotel h: filterHotel){
                System.out.println("ID: " + h.getHotelId() + "  " + "Name: " + h.getHotelName());
            }

            // user entering the id of hotel
            System.out.print("\nEnter the id of the hotel: ");
            String userSelection = sc.next();

            System.out.println("\nPlease wait while we fetch the registration details...");

            // User entering ID Proof
            System.out.println("\nPlease choose your Id Proof");
            System.out.println("1. Aadhaar Card");
            System.out.println("2. PAN Card");
            System.out.println("3. Passport");
            System.out.println("4. Voter Card");
            System.out.print("Choice: ");
            int choiceOfIdProof = sc.nextInt();

            String idProofDetails = null;

            switch (choiceOfIdProof) {
                case 1 -> {
                    System.out.print("Enter Aadhaar number: ");
                    idProofDetails = sc.next();
                }
                case 2 -> {
                    System.out.print("Enter PAN number: ");
                    idProofDetails = sc.next();
                }
                case 3 -> {
                    System.out.print("Enter passport number: ");
                    idProofDetails = sc.next();
                }
                case 4 -> {
                    System.out.print("Enter voter number: ");
                    idProofDetails = sc.next();
                }
                default -> System.out.println("Please choose a valid choice");
            }

            System.out.print("Please enter your name: ");
            String nameOfCustomer = sc.next();

            System.out.print("Please enter your email: ");
            String emailOfCustomer = sc.next();

            System.out.print("Enter your location: ");
            String locationOfCustomer = sc.next();

            // Customer details storing
            Customer customerDetails = new Customer(idProofDetails, nameOfCustomer, emailOfCustomer, locationOfCustomer);

            // Booking confirmation
            System.out.println("\nYour details are saved");
            System.out.println("\nBOOKING CONFIRMED...Please check your mail");

            System.out.println("Hotel ID: " + userSelection);
            System.out.println("Name of Customer: " + customerDetails.getNameOfCustomer());
            System.out.println("ID Proof: " + customerDetails.getIdProof());
        }
    }
}
