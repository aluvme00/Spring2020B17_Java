package day05_Unary_ShortandOperator;

public class PostPre_Practice {
    public static void main(String[] args) {

        int a = 50;

        a= --a + a++ + a-- + a++;

        System.out.println(a);

        int a1 = 1;

        a1 = -a1-- + a1++/ -a1-- * --a1;
        //   -1    +  0 /  -1    *  -1
        //   -1    +  0  * -1
        //   -1    +  0
        //   -1

        System.out.println(a1);


    }
}
