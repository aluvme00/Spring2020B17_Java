package day24_Methods;

public class Warmup {

    public static void Maximum(int a , int b){
        if (a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }

    public static void Calculation(double num1, double num2, char operator){
        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Maximum(10,20);

        Calculation(10,20,'*');

        Calculation(30,40,'+');

        int n1 =1000000;
        int n2= 1000;

        Calculation(n1,n2,'/');




    }

    public static void method(String name){

    }
}
