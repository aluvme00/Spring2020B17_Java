package day29_Wrapper_ArrayList;

public class ParseMethod {
    public static void main(String[] args) {


        String str = "123";

        int a1 = Integer.parseInt(str);

        System.out.println(str + 1); // text
        System.out.println(a1 + 1);  // number

        byte b1 = Byte.parseByte(str);

        System.out.println( b1 + 5);

        Integer I1 = (int) b1;

        String str2 = "10.5";

        float f1 = Float.parseFloat(str2);

        System.out.println(f1 + 1);

        float f2 =(float) Double.parseDouble(str2);

        String str3 = "2143214455";

        double L1 = Long.parseLong(str3);

        System.out.println(L1 + 1);

        String result1 = "true";

        boolean b = Boolean.parseBoolean(result1);

        System.out.println(!b);

        String result2 = "FalSE";

        boolean r2 = Boolean.parseBoolean(result2);

        System.out.println(!r2);




    }

}
