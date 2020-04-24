package day24_Methods;

public class ReturnMethod {

    public static int Addition(int a, int b){

        //System.out.println(a+b);

        return a+b;
    }

    public static void main(String[] args) {

        int result = Addition(10000,20000);

        System.out.println(result);
    }
}
