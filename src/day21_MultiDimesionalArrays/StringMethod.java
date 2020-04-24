package day21_MultiDimesionalArrays;

import java.util.Arrays;

public class StringMethod {

    public static void main(String[] args) {

        String name = "Java";

        char[] chars = name.toCharArray();

        System.out.println(chars[0]);
        System.out.println(chars[3]);

        String str = "I like java";

        String[] arr = str.split(" ");

        System.out.println(Arrays.toString(arr));

        String sentence = "Today is great day";
        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
        String result = "";

        for (int i = words.length-1; i >= 0 ; i--){
            String eachWords = words[i];
            // System.out.print(eachWords + " ");
            result += eachWords+" ";
        }
        System.out.println(result);


        String str2 ="A S D F E D D";
        String[] arr2 = str2.split(" ");

        System.out.println(Arrays.toString(arr2));

    }
}
