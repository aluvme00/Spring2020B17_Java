package day33_CustomClass;

public class cat {

    String breed;
    String color;
    int age;
    String name;

    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void eat(String catFood){
        System.out.println(name + " is eating" + catFood);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }
    public void setCatInfo(String catBreed, String catColor, String catName, int catAge){
        breed = catBreed;
        color = catColor;
        age = catAge;
        name = catName;
    }
    public String toString(){
        return name+", breed is " + breed + ", color is " + color + ", "+age + " years old ";
    }
}
