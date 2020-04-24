package day14_StringClass;

import java.util.Scanner;

public class combineTwoString2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1 = input.next();
        word1 = word1.substring(1);

        System.out.println("Enter the second word");
        String word2 = input.next();
        word2 = word2.substring(1, word2.length());

        String result = word1.concat(word2);

        System.out.println(result);


    }
}
