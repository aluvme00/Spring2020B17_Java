package day18_NestedLoop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();

        int result = 1;

        while (a >=1){
            result *= a;

            a--;

        }
        System.out.println(result);
    }
}
