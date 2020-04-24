package day09_NestedIf_Ternary;

public class Loan_NestedIf {
    public static void main(String[] args) {

        double salary = 1200;
        byte work_history = 3;

        if (salary >= 30000){
            if (work_history >= 2){
                System.out.println("Loan");
            }else {
                System.out.println("need more work experience");
            }
        }else {
            System.out.println("no loan");
        }


    }
}
