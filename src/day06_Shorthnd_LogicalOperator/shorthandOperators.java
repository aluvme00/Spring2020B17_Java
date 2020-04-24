package day06_Shorthnd_LogicalOperator;

public class shorthandOperators {
    public static void main(String[] args) {
        int x = 20;
            x+= 10;     // x = x + 10 = 30
        System.out.println(x); // 30

        x += 60;    // x = x + 60

        System.out.println(x);

        String schoolname = "Cybertek";
            schoolname += 12345; // schoolname = schoolname + 12345
        System.out.println(schoolname);

        System.out.println('a' + 'b');
        //                  97 + 98 == 195

        char ch1 = 'a';
            ch1 += 'b';
        System.out.println(ch1); // character

        int num = 'z'; // num = 122
            num+='x';  // num = 120

        System.out.println(num);

        int A = 100;
            A -= 90;

        System.out.println(A); // 10

        int B = 200;
            B-= A;  // 190

        System.out.println(B); // 190

        int a = 2;
            a*= 3;
        System.out.println(a); // 6

        int b = a *= 10;

        System.out.println(b);
        System.out.println(a);

        int a1 = 100;
        int b1 = (a1 *= 2 )+ ++a1;
        //  b1 = 200 + 201
        // b1 = 401

        System.out.println(b1);

        int x1 = 10;
        int y = x1 += 10*2;
        //  y = 10 += 20 = 30

        System.out.println(y);

        int q = 20;
        int p = q *= 20 *3;
             // q *= 60; // 1200
        System.out.println(p);

        int num1 = 300;
            num1 /= 2;
        System.out.println(num1);

        int num2 = 400;
        num2 /= 20 + 10;

        // num2 = num2 /= 20 + 10
        // num2 = num2 /= 30
        // num2 = 400 / 30

        System.out.println(num2);

        int num3 = 300;
            num3 %= 10 + 20;
            // num3 = 30
            // 0
        System.out.println(num3);

        int k = 400;
            k %= 3*5;
            // k %= 15
        System.out.println(k);





    }
}
