package day26_MethodOverloading;

public class MethodOverloading {

    public static void main(String[] args) {
        method1(10.0);
    }

    public static void method1(int a){
        System.out.println("Original method");

    }
    public static void method1(double a){
        System.out.println("Overload method");

    }

}
