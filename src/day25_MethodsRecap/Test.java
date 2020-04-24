package day25_MethodsRecap;

import Resources.Library;

public class Test {

    public static void main(String[] args) {

        String str = "AAANNNAAA";
        String result = Library.RemoveDuplicates(str);

        System.out.println(result);

        String str1 = "ABBABABAB";
        String str2 = "A";

        int num1 = Library.Frequency(str1,str2);

        System.out.println(num1);

        String str3 = "MMMMMMMMMMMMMFFFFFFFFFFFFrrrrr";
        String ff = Library.FrequencyOfChars(str3);

        System.out.println(ff);
    }
}
