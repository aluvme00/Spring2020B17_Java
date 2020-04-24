package day22_Arrays_Loops;

public class CountOddEven {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int countOddNumbers = 0;
        int countEvenNumbers= 0;

        for ( int each : arr){
            if (each % 2 !=0) {
                countOddNumbers++;
            }else {
                countEvenNumbers++;
            }
        }
    }
}
