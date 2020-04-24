package day14_StringClass;

import java.util.Scanner;

public class StringManipulations2 {
    public static void main(String[] args) {

        String str = "";
        boolean a1 = str.isEmpty();

        System.out.println(a1);

        String username = "";

        if (username.isEmpty()){
            System.out.println("please provide your username");
        }
        String s1 = "Cat";
        String s2 = new String("Cat");

        System.out.println(s1 == s2 ); // false

        System.out.println( s1.equals(s2));




    }
}
