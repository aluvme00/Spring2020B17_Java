package day10_Switch_Scanner;

public class warm_up_ {
    public static void main(String[] args) {

        int day = 6;
        String Theday = "";


        if (day <= 7 && day >= 1){
            if (day == 1){
                Theday = "Monday";
            }else if (day == 2){
                Theday = "Tuesday";
            }else if (day == 3){
                Theday = "Wednesday";
            }else if (day == 4){
                Theday = "Thursday";
            }else if (day == 5){
                Theday = "Friday";
            }else if (day == 6){
                Theday = "Saturday";
            }else if (day == 7){
                Theday = "Sunday";
            }
        }else Theday = "invalid day";
        System.out.println(Theday);
    }
}
