package day17_WhileLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i == 0;) {
            System.out.println("Enter first number");
            int a = input.nextInt();

            System.out.println("Enter second number");
            int a1 = input.nextInt();

            System.out.println("Enter math operator");
            String math = input.next();

            if (math.equals("+")) {
                System.out.println("Addition is: " + (a + a1));
            } else if (math.equals("-")) {
                System.out.println("Subtraction is " + (a + a1));
            } else if (math.equals("*")) {
                System.out.println("Multiplication is " + (a * a1));
            } else if (math.equals("/")) {
                System.out.println("Division is " + (a / a1));
            } else if (math.equals("%")) {
                System.out.println("Remainder is " + (a % a1));
            } else {
                System.out.println("invalid");
            }

            System.out.println("Do you wanna continue");
            String answer = input.next();

            if (answer.equalsIgnoreCase("no")){
                break;
            }
        }




    }
}
