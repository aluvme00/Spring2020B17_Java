package day26_MethodOverloading;

public class Uniques {
    public static void main(String[] args) {
        String str = "ABB";
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        String str2 = "Cybertek";
        String result2 = Unique(str2);
        System.out.println(result2
        );
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

    public static String Unique(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        return result;

    }

}
