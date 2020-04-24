package day27_DateTime;

public class Find_Min {

    public static void main(String[] args) {

        int[] arr = {5,7,6,7};

        int Min = arr[0];

        for (int each : arr){
            if (each < Min){
                Min = each;
            }
        }
        System.out.println(Min);
        int[] arr2 = {100,100,200,300,400};
        System.out.println(minimum(arr2));

        double[] arr3 = {10.2,104,22,234.0};
        System.out.println(minimum(arr3));


    }
    public static int minimum (int[] arr){
        int Min = arr[0];
        for (int each : arr) {
            if (each < Min) {
                Min = each;
            }
        }
            return Min;

    }
    public static double minimum(double[] arr){
        double Min = arr[0];
        for (double each : arr) {
            if (each < Min) {
                Min = each;
            }
        }
        return Min;
    }
}
