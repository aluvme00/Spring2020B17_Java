package day10_Switch_Scanner;

public class Words_Warm_up {
    public static void main(String[] args) {

        int number = 7;
        String result = "";

        result = (number == 0)? "zero" :
                (number == 1) ? "one": (number == 2)? "two":(number == 3)? "three":(number == 4)? "four": (number == 5)? "five": (number == 6)? "six":(number == 7)? "seven": (number == 8)? "eight": (number == 9)? "nine":"invalid";
        System.out.println(result);
    }
}
