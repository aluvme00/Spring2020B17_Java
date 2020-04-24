package day18_NestedLoop;

public class DoWhileLoop2 {
    public static void main(String[] args) {

        int num = 10;

        while (num >= 100){
            System.out.println(num);
            num--;
        }

        System.out.println("===========================================");

        int num2 = 103;
        do {
            System.out.println(num2);
            num2--;
        }while (num2>= 100);
    }
}
