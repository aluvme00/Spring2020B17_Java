package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {

        boolean US_citizen = true;
        int age = 19;
        if (US_citizen){
            if (age > 17){
                System.out.println("You are eligible to vote");
            }else {
                System.out.println("grow up first and then vote");
            }

        }else{
            System.out.println("only the US citizens are eligible to vote");
        }
        int score = 908;
        String grade = "";
        if (score >= 0 && score <= 100){
            if ( score > 90 ){
                grade = "A";
            }else if (score >= 80 ){
                grade = "B";
            }else if (score >= 70){
                grade = "C";
            }else if (score >= 60){
                grade = "D";
            }else if (score >= 0){
                grade = "F";
            }
        }else {
            grade = "invalid";
        }
        System.out.println(grade);

    }
}
