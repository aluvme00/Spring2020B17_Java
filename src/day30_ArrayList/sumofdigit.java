package day30_ArrayList;

import java.util.Arrays;

public class sumofdigit {
    public static void main(String[] args) {

        String str = "a1b2c3";
        char[] arr = str.toCharArray();

        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (char each : arr){
            boolean isDigit = each >= 48 && each <= 57;
            if (isDigit){
                sum += Integer.parseInt(each + "");
            }
        }
        System.out.println(sum);

        boolean b = Character.isAlphabetic('A');


    }
}
