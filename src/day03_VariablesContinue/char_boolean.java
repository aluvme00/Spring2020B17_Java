package day03_VariablesContinue;

public class char_boolean {

    public static void main(String[] args) {

        System.out.println('z' == 100);
        //                 122  = 100
        System.out.println('z' == 122);
        //                 122 =  122
        System.out.println('a' == 'A');

        System.out.println('a' > 'b'); // 97 > 98

        System.out.println('a' != (98-1));

        boolean r1 = 'a' > 50; // true

        boolean r2 = 'b' == 'a'+1;

        System.out.println(r1);

        System.out.println(r2);
    }
}
