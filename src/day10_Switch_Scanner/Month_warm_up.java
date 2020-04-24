package day10_Switch_Scanner;

public class Month_warm_up {
    public static void main(String[] args) {

        int num = 3;

        boolean days28 = num == 2;
        boolean days30 = num == 4 || num == 6 || num == 9 || num == 11;
        boolean days31 = num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12;

        String result = "";

        if (num <13 && num > 0){
            result = (days28)? "Has 28days": (days30)? "has 30days":"has 31 days";

        }else{
            result = "invalid";
        }
        System.out.println(result);


    }
}
