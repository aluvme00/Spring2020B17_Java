package day22_Arrays_Loops;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_Arrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String arr[] = new String[5];

        for (int i = 0; i < arr.length ; i++){
            arr[i] = input.next();
        }

        System.out.println(Arrays.toString(arr));

        for ( String each: arr){
            String str = each.substring(0,3);

            System.out.println(str);
        }
    }
}
