package day38_Constructors;

public class circleObject {

    public static void main(String[] args) {

        double r = 3;

        circle circle1 = new circle(r);
        double areaOfCircle = circle1.area();
        System.out.println(areaOfCircle);

    }
}
