package day25_MethodsRecap;

public class Return_Statement {

    public static void main(String[] args) {

        Method1();
        System.out.println("Hello");
    }

    public static void Method1(){
        if (10>9){
            return;
        }
    }

    public static void Method2() {
        if (10 < 11) {
            System.exit(0);
        }
    }

}
