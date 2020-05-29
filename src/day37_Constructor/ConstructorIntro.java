package day37_Constructor;

public class ConstructorIntro {
    public ConstructorIntro(int a){

        System.out.println("Constructor with parameter of int");

    }
    public static void main(String[] args) {
        ConstructorIntro obj2 = new ConstructorIntro(10);

        ConstructorIntro obj3 = new ConstructorIntro(10);
    }
}
