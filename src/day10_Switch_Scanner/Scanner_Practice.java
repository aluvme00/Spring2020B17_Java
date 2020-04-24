package day10_Switch_Scanner;

import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your annual Salary");
        int num1 = input.nextInt();
        System.out.println("Enter your work hours in a week");
        int num2 = input.nextInt();
        System.out.println("Enter your number");
        byte num3 = input.nextByte();
        boolean total = (num1 > num2 && num1 < num3 );

        System.out.println("The hour rate is: $" + total);







    }
}
