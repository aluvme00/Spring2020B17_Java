package day10_Switch_Scanner;

public class Char_Switch {
    public static void main(String[] args) {

        char ch = 'A';
        String result = "";

        switch (ch){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            default:
                System.out.println("invalid");
        }

    }
}
