package day16_ForLoop;

public class EnglishAlphabet {
    public static void main(String[] args) {
        for (char ch1 = 'A'; ch1 <='Z'; ch1++){
            System.out.print(ch1);
        }
        for (char ch2 = 'Z'; ch2 >= 'A'; ch2--){
            System.out.print(ch2);
        }
    }
}
