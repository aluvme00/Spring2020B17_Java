package day14_StringClass;

public class StringManipulations {
    public static void main(String[] args) {

        String str = "I like to learn java. I like to watch the movie jumanji";
        int a1 = str.indexOf("j");

        System.out.println(a1);

        int a2 = str.indexOf("jum");
        System.out.println(a2);

        int a3 = str.indexOf(" I");
        System.out.println(a3);

        String s = "I like Java, and  I like reading";

        int b1 = s.lastIndexOf("I");
        System.out.println(b1);

        int b2 = s.lastIndexOf("l");
        System.out.println(b2);

        String z = "I like c#, c# is cool";

        int z1 = z.indexOf(" c#");
        System.out.println(z1);

        String x = "I like java, java is fun, java programming is fun";
        int x1 = x.indexOf("java is");

        System.out.println(x1);


    }
}
