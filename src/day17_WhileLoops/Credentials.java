package day17_WhileLoops;

import java.util.Scanner;
import java.util.TreeMap;

public class Credentials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String username = input.next();

        System.out.println("Enter password");
        String password = input.next();

        while (!username.equals("cybertek") && !password.equals("cybertek123")){
            System.out.println("re-enter");
            System.out.println("Enter username");
             username = input.next();

            System.out.println("Enter password");
             password = input.next();
        }


        System.out.println("Logged in");
    }
}
