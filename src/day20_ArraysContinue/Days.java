package day20_ArraysContinue;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {

        String[] days = {"Mon" ,"Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
            int num = input.nextInt();

            int atte = 1;

        while (num > 7 || num <= 0 ){

            System.out.println("Invalid Entry, please re-enter the number");
            num = input.nextInt();
            atte++;

            if (atte ==3 && (num>7 || num <1)){
                System.exit(0);
            }
        }
                String result = days[num -1];

        System.out.println(result);
    }
}
