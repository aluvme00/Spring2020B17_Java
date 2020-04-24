package day22_Arrays_Loops;

public class Java_Python {
    public static void main(String[] args) {

        String sentence = "I like java and javascript";

        sentence = sentence.toLowerCase();

        int countJava = 0 ;
        int countPython = 0;

        String[] word = sentence.split(" ");

        for ( String  each : word){
            if (each.contains("java")){
                countJava++;
            }
            if (each.contains("python")){
                countPython++;
            }
        }

        System.out.println(countJava == countPython);
    }
}
