package day37_Constructor;

public class Data {

    static String studentNAme= "Mike";

    static {
        studentNAme = "Jordan";
    }

    public static void main(String[] args) {

        studentNAme = "Jean";
        System.out.println();
    }

}