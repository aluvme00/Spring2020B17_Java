package day14_StringClass;

import java.util.Scanner;

public class middleCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.next();

        String middleCharacter = "";

        int totalChars = word.length();
        int middleNumber = totalChars/2;

        if (totalChars % 2 != 0){
            middleCharacter += word.charAt(middleNumber);
        }else {
            middleCharacter = middleCharacter + word.charAt(middleNumber -1) + word.charAt(middleNumber);
        }
        System.out.println(middleCharacter);
    }
}
