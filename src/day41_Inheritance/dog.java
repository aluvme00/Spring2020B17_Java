package day41_Inheritance;

public class dog extends Animal{

    public void bark(){
        System.out.println(name + " is barking");
    }

    public static void main(String[] args) {

        dog dog1 = new dog();
            dog1.name = "Lucy";

        System.out.println(dog1.name);
        dog1.move();
        dog1.eat();
        dog1.bark();

    }
}
