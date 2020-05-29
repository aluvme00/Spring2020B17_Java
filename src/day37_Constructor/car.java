package day37_Constructor;

public class car {

    String name;
    String brand;
    int year;
    String color;

    public car(String name,String brand, int year, String color){
        this.brand = brand;
        this.color = color;
        this.name = name;
        this.year = year;
    }
    public String toString(){
        return "Name: " + name +" Year: "+ year + " Brand: "+brand+ " Color: "+ color;
    }
}
