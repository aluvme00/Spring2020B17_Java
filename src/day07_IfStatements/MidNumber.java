package day07_IfStatements;

public class MidNumber {
    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 50;

        boolean aMid = a < b && a > c || a < c && a > b;
        boolean bMid = b < a && a > c || b < c && b > a;
        boolean cMid = c < a && c > b || c < b && c > a;

        if (aMid){
            System.out.println(a + " is the midium number ");
        }
        if (bMid){
            System.out.println(b + " is the medium number ");
        }
        if (cMid){
            System.out.println(c + " is the medium number ");
        }
    }
}
