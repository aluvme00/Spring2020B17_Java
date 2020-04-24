package day06_Shorthnd_LogicalOperator;

public class warmup {

    public static void main(String[] args) {

        double g = 1;
        double l = g*3.785;
        String result = g + " gallons is equal to: " + l + " liters";

        System.out.println(result);

        System.out.println("========================================================");

        double L = 1;
        double G = L/3.785;

        String result1 = L + " liters equal to " + G + " gallons";

        System.out.println("=========================================================");

        int a = 200;
        int b = -a++ + - --a * a-- %2;

        System.out.println(result1);



    }
}
