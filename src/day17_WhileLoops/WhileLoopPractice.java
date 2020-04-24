package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter yes or no");
        String word = input.next();

        boolean valid = word.equalsIgnoreCase("Yes") || word.equalsIgnoreCase("No");

        while (!valid) {
            System.out.println("Please re-enter");
            input.next();
            if (valid) {
                break;
            }
        }
            if (word.equalsIgnoreCase("Yes")) {
                System.out.println("Entered yes");
            } else if (word.equalsIgnoreCase("No")) {
                System.out.println("Entered no");
            }
        }


}
