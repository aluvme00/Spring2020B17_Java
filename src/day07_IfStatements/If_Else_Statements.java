package day07_IfStatements;

public class If_Else_Statements {
    public static void main(String[] args) {

        int number = 0;

        if (number % 2 == 0 ){
            System.out.println( number + " is even");
        }
        if (number % 2 != 0){
            System.out.println( number + " is odd");
        }

        if (number % 2 == 0){
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        int age = 10;

        if (age >= 21 ){
            System.out.println("Here is your vodka");
        }else{
            System.out.println("no alcohol");}
    }
}
