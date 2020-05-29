package day35_Static;

public class staticVariables {
    int a2 = 200; // instance variable

    static  int a3 = 300; // static

    public static void main(String[] args) {

        int a1= 100; // local variable

        staticVariables objt1 = new staticVariables();
        objt1.a2 = 1000;
        staticVariables objt2 = new staticVariables();
        objt2.a2 = 2000;

        System.out.println(objt1.a2);
        System.out.println(objt2.a2);
    }
}
