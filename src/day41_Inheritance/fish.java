package day41_Inheritance;

public class fish extends Animal{

    public void swim(){
        System.out.println(name + " is swimming");
    }

    public static void main(String[] args) {

        fish obj1 = new fish();
        obj1.name = "Neemo";
        obj1.weight = 5;
        obj1.size = "small";

        obj1.eat();
        obj1.move();
        obj1.swim();
    }
}
