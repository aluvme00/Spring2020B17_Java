package day26_MethodOverloading;

public class methodoverloading2 {

    public static void sum2Numbers(int a, int b){
        System.out.println(a+b);
    }
    public static void sum3Numbers(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum4Numbers(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
    //===========================================================================

    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }


}
