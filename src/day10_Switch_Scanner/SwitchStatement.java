package day10_Switch_Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        long a =4;

        switch (1){
            case 1:
                System.out.println("One");

            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("invalid case");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
        }

        float f = 12_345;

        System.out.println(f);

    }
}
