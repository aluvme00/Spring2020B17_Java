package day08_IfStatements;
/*1.  write a program that can check the equality of the three given numbers
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal

   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are equal ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are equal ==> none of them are equal

 */

public class equalNumbers {
    public static void main(String[] args) {
        double a = 200;
        double b = 200;
        double c = 200;

        boolean aEqualb = a == b && a != c;
        boolean aEqualc = a == c && a != b;
        boolean bEqualc = b == c && b != a;

        boolean allequal = a == b && a == c;

        boolean noneOfTheEqual = a != b && a != c && b != c;

        if (aEqualb) {
            System.out.println(a + " is equal to " + b);
        }

        if (aEqualc) {
            System.out.println(a + " is equal to " + c);
        }
        if (bEqualc) {
            System.out.println(b + " is equal to " + c);
        }

        if (allequal) {
            System.out.println("all equal");
        }
        if (noneOfTheEqual){
            System.out.println("none of them are equal");
        }





    }
}
