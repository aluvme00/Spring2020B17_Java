package day22_Arrays_Loops;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {

        int[] arr = {10,43,34,-2,22,500};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int[] RevAr = new int[arr.length];

        int j = arr.length-1;

        for (int i = 0; i < arr.length; i++){
            RevAr[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(RevAr));
    }
}
