package day12_JavaRecap;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the building number");
        int Bnumber = input.nextInt();

        System.out.println("Building number is: " + Bnumber);


        System.out.println("Enter the street name");
        String street = input.next();

        System.out.println("Street is: " + street);

        System.out.println("Enter the zip code: ");
        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("Enter the city, state");
        String cityName = input.nextLine();

        String fulladdress = Bnumber + " "+ street+ ", \n" + cityName + ", " + zipCode;

        System.out.println("The address is: " + fulladdress);



    }
}
