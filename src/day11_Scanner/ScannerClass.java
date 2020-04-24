package day11_Scanner;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();
        System.out.println("Your name is: " + firstName +" "+ lastName);

        System.out.println("Are you employed?");
        boolean working = input.nextBoolean();
        System.out.println("i am employed: " + working);

        double salary = 0;

        if ( working == true){
            System.out.println("Whats your salary?");
            double rsalary = input.nextDouble();
            System.out.println("Your salary is: $" + rsalary);

        }else {
            System.out.println("get your job");
        }






    }
}
