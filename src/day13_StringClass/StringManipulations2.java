package day13_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {

        String str = "Cybertek school is the best";
        String schoolname = str.substring(0,8);

        System.out.println(schoolname);

        String fullname = "Sun Woo Kim";
        String lastname = fullname.substring(0,6);

        System.out.println(lastname);

        String s1 = "I love java programming language";
        String className = s1.substring(7);

        System.out.println(className);

        String s2 = "I like c# Programming";
        s2 = s2.replace("c#", "java");

        System.out.println(s2);

        String r1 = "I like c#, c# is fun, c# is cool";

        r1 = r1.replaceFirst("c#", "java");

        System.out.println(r1);



    }
}
