package day06_Shorthnd_LogicalOperator;

import java.security.spec.RSAOtherPrimeInfo;

public class SingleIfStatement {
    public static void main(String[] args) {
        boolean coldWeather = true;
        if (coldWeather){
            // true
            System.out.println("wear your hat");
            System.out.println("wear your jacket");

        }
        boolean coronaDetected = true;
        if (coronaDetected){
            System.out.println("buy more toilet papers");
        }
        System.out.println("================================================");
        int a = 100;
        boolean evenNumber = a % 2 == 0;
        boolean oddNumber = a % 2 != 0;

        if (evenNumber){
            System.out.println(a + " is a even number ");

        }
        if (oddNumber){
            System.out.println(a + " is odd number ");
        }

    }
}
