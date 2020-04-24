package day14_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {

        String str1 = "CYBERTEK";
        String str2 = "cybertek";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        String s1 = "Cybertek School";

        boolean b = s1.contains("School");

        System.out.println(b);

        String s3 = "United States";
        System.out.println(s3.startsWith("U"));

        String s4 = "Cybertek School";
        System.out.println(s4.endsWith("l"));
        System.out.println(s4.endsWith("School"));

        System.out.println(s4.endsWith("Cybertek"));


    }
}
