package day07_IfStatements;

public class MinimumNumber {
    public static void main(String[] args) {
        double a = 100.5;
        double b = 200.5;
        double c = 300.5;

        boolean aMin = a < b && a < c;
        boolean bMin = b < a && b < c;
        boolean cMin = c < a && c < b;

        if (aMin){
            System.out.println(a + " is the minimum number ");
        }
        if (bMin){
            System.out.println(b + " is the minimum number ");
        }
        if (cMin){
            System.out.println(c + " is the minimum number ");
        }
    }
}
