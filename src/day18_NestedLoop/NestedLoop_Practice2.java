package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoop_Practice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter two number");
            int a = input.nextInt();
            int b = input.nextInt();

            System.out.println("Addition of two number is " + (a + b));

            System.out.println("Do you want continue?");
            String answer = input.next();
            while (!answer.equalsIgnoreCase("Yes") || !answer.equalsIgnoreCase("no")) {
                System.out.println("re - enter");
                answer = input.next();
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using");
                break;

            }
        }

    }
}
