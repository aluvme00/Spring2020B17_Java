package day05_Unary_ShortandOperator;

public class Divisivility {
    public static void main(String[] args) {


        int number = 65;

        boolean divisibleBy2 = number % 2 == 0;
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        System.out.println(number + " is divisible by 2 without any remainder " + divisibleBy2);
        System.out.println(number + " is divisible by 3 without any remainder " + divisibleBy3);
        System.out.println(number + " is divisible by 5 without any remainder " + divisibleBy5);
    }
}
