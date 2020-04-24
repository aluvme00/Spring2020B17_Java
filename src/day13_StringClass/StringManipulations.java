package day13_StringClass;

public class StringManipulations {
    public static void main(String[] args) {

        String str = "Cybertek";
        int totallength = str.length();

        System.out.println(totallength > 548);

        int maxindexnum = str.length() - 1;

        System.out.println(maxindexnum);

        String s1 = "cybertek";
        s1 = s1.concat(" School");
        System.out.println(s1);

        String name1 = "CYBERTEK";
        name1 = name1.toLowerCase();

        System.out.println(name1);

        String name2 = "cybertek";
        name2 = name2.toUpperCase();

        System.out.println(name2);

        String a1 = "              Today is a great day";
        a1 = a1.trim();

        System.out.println(a1);




    }
}
