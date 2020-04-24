package day02_Variables;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Length is: 10");
        System.out.println("Width is: 20");
        byte l = 10;
        System.out.println(l);
        byte w = 20;
        System.out.println(w);
        short s1 = 4000;
        // short s2 = 100000; out of range
        int a = 100000;
        long c = 100000000000000000l;
        System.out.println(c);

        byte byteNum = 100;
        short shortNum = byteNum;

        // GDP: 0.035
        double decimalNum = 0.5;
        float decimalNum2 = 0.5f;
        System.out.println(0.5);

        // double prefer and int is prefer

        int intnumber = 100;
        float floatNum = intnumber;
        double doubleNum = intnumber;

        System.out.println(intnumber);
        System.out.println(floatNum);
        System.out.println(doubleNum);


    }
}
