package day15_ForLoop;

public class reverse {
    public static void main(String[] args) {
        String str = "Java";

        String reversed = ""+ str.charAt(3)+ str.charAt(2)+str.charAt(1)+str.charAt(0);

        System.out.println(reversed);

        String reversed2 = str.substring(3) + str.substring(2,3) + str.substring(1,2)+str.substring(0,1);

        System.out.println(reversed2);

        str = str.trim();

        System.out.println(str);
    }
}
