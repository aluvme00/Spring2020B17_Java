package day23_methods;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        String name = "Sun Woo Kim";
        ReverseString(name);
    }

    public static void ReverseString(String reverse){

        String str = "";
        for (int i = str.length()-1 ; i >= 0; i-- ){
            System.out.println(str.charAt(i));
        }

        System.out.println();


    }
}
