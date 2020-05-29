package day38_Constructors;

public class circle {

    static double pi = 3.14;
    double radius;
    double diameter;

    public circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
    }
    public double area(){
        return pi * radius * radius;
    }
    public double perimeter(){
        return diameter * pi;
    }
    public String toString(){
        return "Circle's radius: " + radius + ", Circle's diameter: " + diameter + ", Circle's are: " + area() + ", Circle's Perimeter: " + perimeter();
    }
}
