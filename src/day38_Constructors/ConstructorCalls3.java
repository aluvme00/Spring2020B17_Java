package day38_Constructors;

public class ConstructorCalls3 {

    public ConstructorCalls3(){
        this(10);
        System.out.println("default");
    }
    public ConstructorCalls3(int a){
        System.out.println("int argument");
    }

    public static void main(String[] args) {
        ConstructorCalls3 obj = new ConstructorCalls3();
    }

    public void method(){

    }
}
