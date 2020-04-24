package day14_StringClass;

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the username");
        String inputUsername = input.nextLine();

        System.out.println("Enter the password");
        String inputPassword = input.nextLine();

        boolean loggedIn = inputUsername.equals("cybertek") && inputPassword.equals("cybertekschool");
        boolean Invalidusername = !inputUsername.equals("cybertek") && inputPassword.equals("cybertekschool");
        boolean Invalidpassword = inputUsername.equals("cybertek") && !inputPassword.equals("cybertekschool");

       if (!inputUsername.isEmpty() && !inputPassword.isEmpty()){
           if (loggedIn){
               System.out.println("logged in");
           }else if (Invalidusername){
               System.out.println("Invalid username");
           }else if (Invalidpassword){
               System.out.println("Invalid password");
           }else {
               System.out.println("Invalid ID and Password");
           }

       }else {
           System.out.println("please enter the credentials");
       }
    }
}
