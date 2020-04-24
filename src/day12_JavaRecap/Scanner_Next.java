package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the building: ");
        String fullAddress = "";
        short Bnumber = scan.nextShort();
        fullAddress += Bnumber + " ";

        System.out.println("Enter the street name: ");
        String streetName = scan.next();
        fullAddress += streetName + " ";

        System.out.println("Enter the type of the road: ");
        String roadType = scan.next();
        fullAddress += roadType + ", ";

        System.out.println("Enter the city name, state, zip code: ");
        String cityName = scan.next();
        fullAddress += cityName + " ";

        String state = scan.next();
        fullAddress += state + ", ";

        int zipCode = scan.nextInt();
        fullAddress += zipCode;

        System.out.println("The address is: " + fullAddress);




    }
}
