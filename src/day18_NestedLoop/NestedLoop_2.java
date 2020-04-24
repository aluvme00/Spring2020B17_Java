package day18_NestedLoop;

public class NestedLoop_2 {
    public static void main(String[] args) {

        for (int i = 9; i >=1; i--){
            for (int j = 1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (char z = 'z'; z >= 'a'; z--){
            for (char ch = 'a'; ch <= z ; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
