package day21_MultiDimesionalArrays;

public class AvgNumber {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        int length = arr.length;
        int sum = 0;

        for (int i = 0; i <= length-1; i++){
            int eachnum = arr[i];
            sum += eachnum;
        }

        System.out.println(sum);

        double avg = sum/(double)length;


        System.out.println(avg);


        int[] arr2 = {1,2,2};

    }
}
