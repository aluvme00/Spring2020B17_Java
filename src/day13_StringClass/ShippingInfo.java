package day13_StringClass;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the building number");
        int Bnumber = input.nextInt();
        System.out.println(Bnumber);

        input.nextLine();

        System.out.println("Enter the street address");
        String street = input.nextLine();
        System.out.println(street);

        System.out.println("Enter the city name");
        String cityname = input.next();
        System.out.println(cityname);

        System.out.println("Enter the state");
        String state = input.next();
        System.out.println(state);

        System.out.println("Enter the zip code");
        int zipcode = input.nextInt();
        System.out.println(zipcode);

        String fulladdress = Bnumber +" "+ street+"\n " + cityname + " " + state+ "\n " + zipcode;


        System.out.println("The full address is: " + fulladdress);

        input.nextLine();

        System.out.println("Enter your full name");
        String name = input.nextLine();
        System.out.println(name);

        String result = "Ship to " + name + "\n" + fulladdress;
        System.out.println(result);



    }
}
