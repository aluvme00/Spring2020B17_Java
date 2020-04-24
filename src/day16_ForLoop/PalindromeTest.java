package day16_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();
        String reversedWord = "";

        for (int i = word.length()-1; i >= 0 ; i--){
            reversedWord += word.charAt(i);

        }
        System.out.println(reversedWord);

        if (word.equals(reversedWord)){
            System.out.println(true);
        }
    }
}
