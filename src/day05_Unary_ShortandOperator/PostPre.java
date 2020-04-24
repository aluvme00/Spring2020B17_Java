package day05_Unary_ShortandOperator;

public class PostPre {
    public static void main(String[] args) {

        int a = 100;
        System.out.println(++a);
        System.out.println(a);

        int b = 100;
        System.out.println(--b);
        System.out.println(b);

        int A = 100;
        System.out.println(A++);
        System.out.println(A);

        int B =100;
        System.out.println(B--);
        System.out.println(B);

        int z= 10;
        int x= ++z;

        System.out.println(x);
        System.out.println(z);

        int s = 10;
        int f = s++;

        System.out.println(s);
        System.out.println(f);

        double t1 = 3.5;
        double t2 = t1--;
        System.out.println(t2);
        System.out.println(t1);

        int num =35;
        System.out.println(num++);
        System.out.println(num--);




    }
}
