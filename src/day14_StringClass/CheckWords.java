package day14_StringClass;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

        System.out.println("Enter third word");
        String word3 = input.next();

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();

        if (length1 == length2 && length1 == length3 && length2 == length3){
            System.out.println("All words are same length");
        }else if (length1 != length2 && length1 != length3 && length2 != length3){
            System.out.println("All words are different");
        }else {
            System.out.println("not same nor different");
        }
    }
}