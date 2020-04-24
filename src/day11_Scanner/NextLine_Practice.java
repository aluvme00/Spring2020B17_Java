package day11_Scanner;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = input.nextByte();
        System.out.println("Your age is: " + age);

        input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println("Your name is: " + fullName);

        System.out.println("Are you employed?");
        boolean employment = input.nextBoolean();

        if (employment == true){
            System.out.println("Enter your salary");
            double salary = input.nextDouble();
            System.out.println("Your salary is: $" + salary);
        }else {
            System.out.println("no job");
        }

    }
}
