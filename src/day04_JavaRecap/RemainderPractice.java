package day04_JavaRecap;

public class RemainderPractice {
    public static void main(String[] args) {

        int number = 87654;

        boolean oddNumber = number % 2 != 0;
        boolean evenNumber = number % 2 == 0;

        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        System.out.println("The number " + number + " is odd number: " + oddNumber);
        System.out.println("The number " + number + " is odd number: " + evenNumber);
        System.out.println("The number " + number + " is divisible by 3: " + divisibleBy3);
        System.out.println("The number " + number + " is divisible by 5: " + divisibleBy5);
    }
}
