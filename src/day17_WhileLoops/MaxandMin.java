package day17_WhileLoops;

import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int MaxNum = -999999999;
        int MinNum = 999999999;

        for (int i= 1; i < 6; i++) {
            System.out.println("Enter a number");
            int number = input.nextInt();

            if (number > MaxNum ){
                MaxNum = number;
            }else {
                MinNum = number;
            }
        }
        System.out.println("Max number is "+ MaxNum);
        System.out.println("Min number is "+MinNum);
    }
}
