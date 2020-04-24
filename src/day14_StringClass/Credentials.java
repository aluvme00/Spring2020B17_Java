package day14_StringClass;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {

        String Validusername = "cybertek";
        String Validpaswod = "cybertekschool";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");

        String inputUsername = input.next();

        System.out.println("Enter your password");

        String inputPassword = input.next();

        boolean ValidCredentials = inputUsername.equals(Validusername) && inputPassword.equals(Validpaswod);

        if (ValidCredentials){
            System.out.println("Successful");
        }else {
            System.out.println("invalid username");
        }

    }
}
