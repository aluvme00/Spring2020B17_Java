package day24_Methods;

import java.util.Arrays;

public class TasksFromYesterday {

    public static void MaxNumber(int[] array){

        Arrays.sort(array);  // ascending order
        System.out.println("Maximum number is " + array[array.length-1] );


    }
    public static void MinNumber(int[] array){
        Arrays.sort(array);
        System.out.println("Minimum number is " + array[0]);
    }
    public static void Descending(int[] array){
        Arrays.sort(array);
        for (int i = array.length-1; i >= 0 ; i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {10,8,9,3,4,5};
        MaxNumber(arr);
        MinNumber(arr);
        Descending(arr);

        int arr2[]= {100,20,30,40,40,-100};
        MaxNumber(arr2);
        MinNumber(arr2);
        Descending(arr2);
    }
}
