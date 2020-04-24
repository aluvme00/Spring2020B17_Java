package day09_NestedIf_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {


        int number = 100;
        char ch1 = ' ';

        char ch2 = (number > 0 ) ? '+' :  (number < 0 ) ? '-' : '0';

        System.out.println(ch2);

        byte score = 75;

        String grade = "";

        String grade2 = (score >= 90 && score <= 100 ) ? "A" :
                (score >= 80 && score <= 89) ? "B" :
                (score >= 70 && score <= 79 ) ? "C" :
                (score >= 60 && score <= 69 ) ? "D" :
                        (score >= 59 && score <= 0  ) ? "F" :  "invalid";

        System.out.println(grade2);

    }
}
