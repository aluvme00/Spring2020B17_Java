package day38_Constructors;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("default Constructor");
    }
    public ConstructorCalls2(int a){
        this();
        System.out.println(" Constructor with int argument");
    }
    public ConstructorCalls2(String str){
        this(10);
        ConstructorCalls2 obj = new ConstructorCalls2(10);
    }

    public static void main(String[] args) {
        ConstructorCalls2 d = new ConstructorCalls2("Heelo");
    }
}
