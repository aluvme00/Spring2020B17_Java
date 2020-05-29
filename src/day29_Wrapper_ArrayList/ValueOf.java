package day29_Wrapper_ArrayList;

public class ValueOf {

    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str); // integer, 123

        System.out.println(a);

        double d =  a;                     // unboxing

        System.out.println(d);

        String str2 = "15.5";

        double d1 = Double.parseDouble(str2);

        System.out.println(d1);

        double d2 = Double.valueOf(str2);

        // Double

        String bb = "True";
        String cc = "FALSe";
        String dd = "100000000.5";
        String ee = "123456";

        boolean ss = Boolean.parseBoolean(bb);
        boolean rr = Boolean.parseBoolean(cc);
        float ff = Float.parseFloat(dd);
        int eee = Integer.valueOf(ee);

        System.out.println(ss);

        int maxnum = Integer.MAX_VALUE;

        System.out.println(maxnum);


    }
}
