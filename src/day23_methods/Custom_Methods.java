package day23_methods;

public class Custom_Methods {

    public static void main(String[] args) {

        System.out.println("Hello Cybertek");
        printHello5Times();
        System.out.println("Hello Batch 18");
        printHello5Times();
        System.out.println("Hello Saim");
        printHello5Times();
        System.out.println("=============================================");
        EvenNumbers();
        OddNumbers();

    }

    public static void printHello5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    public static void EvenNumbers(){

        for (int i = 0 ; i <= 99; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void OddNumbers(){
        for (int i = 0; i<=99; i++){
            if (i %2 !=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
