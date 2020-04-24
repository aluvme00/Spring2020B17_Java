package day13_StringClass;

public class StringLiteral {
    public static void main(String[] args) {

        String str1 = "cat";
        String str2 = new String("cat");

        System.out.println(str1+ ":"+ str2);
        System.out.println(str1 == str2);

        String str3 = "cat";

        System.out.println(str1 == str3);


    }
}
