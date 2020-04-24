package day24_Methods;

import java.util.Scanner;

public class birthYear {

    public static void Age(int birthYear){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current year");
        int currentYear = input.nextInt();

        int age = currentYear - birthYear;

        if (birthYear < currentYear && birthYear > 1900) {
            System.out.println(age);
        }else {
            System.out.println("Invalid age");
        }
    }

    public static void main(String[] args) {

        PrintHelloCybertek();
        // Age(1990);

    }

    public static void PrintHello(){
        System.out.println("Hello");
    }
    public static void PrintCybertek(){
        System.out.println("Cybertek");
    }

    public static void PrintHelloCybertek(){
        PrintHello();
        PrintCybertek();
    }
}
