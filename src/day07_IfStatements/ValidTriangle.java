package day07_IfStatements;

public class ValidTriangle {
    public static void main(String[] args) {

        short angle1 = 30;
        short angle2 = 50;
        short angle3 = 100;

        int sumOfAngles = angle1 + angle2 + angle3;

        boolean validTriangle = sumOfAngles == 180;

        if (validTriangle){

        System.out.println(" The shape is a triangle");}
        if (!validTriangle) {
            System.out.println(" The shape is not a valid triangle");
        }

    }
}
