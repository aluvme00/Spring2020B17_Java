package day06_Shorthnd_LogicalOperator;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean result = true;
        System.out.println(!result); // false

        boolean result1 = ! (10 + 15 > 15); // false

        System.out.println(result1);

        boolean result2 = !true == !false;

        System.out.println(result2);

        boolean R1 = "Corona Virus" != "End of the world" && "toilet paper" == "cure";

        System.out.println(R1);

        boolean R2 = 10 > 15 && 15< 13;

        System.out.println(R2);

        boolean R3 = 'a' == 'b'-1 && 'b' + 1 == 'c';

        System.out.println(R3);



    }
}
