package day15_ForLoop;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstName = input.next();

        System.out.println("Enter the second name");
        String lastName = input.next();

        String initials =""+ firstName.charAt(0) + lastName.charAt(0);

        initials = initials.toUpperCase();

        System.out.println(initials);

        System.out.println(firstName == lastName);





    }
}
