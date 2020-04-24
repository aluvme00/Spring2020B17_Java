package day26_MethodOverloading;

public class Frequency {
    public static void main(String[] args) {

        String str = "AAAAA";
        char ch = 'A';

        char arr[] = str.toCharArray();

        int count = 0;

        for (char each: arr){
            if (each == ch) {
                count++;
            }
        }

        System.out.println(count);

    }

    public static int frequency (String str, char ch){
        char arr[] = str.toCharArray();
        int count = 0;
        for (char each: arr){
            if (each == ch) {
                count++;
            }
        }
        return count;
    }

}
