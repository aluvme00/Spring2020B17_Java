package day25_MethodsRecap;

import Resources.Library;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCC";

        String nonDuplicate = Library.RemoveDuplicates(str);

        String result = "";

        for (int i = 0; i < nonDuplicate.length(); i++) {

            String ch = nonDuplicate.charAt(i) + "";
            int Frequency = Library.Frequency(str,ch);
            result += ch +Frequency + " ";

        }
        System.out.print(result);

    }

    public static String FrequencyOfChars(String str){
        String nonDuplicate = Library.RemoveDuplicates(str);
        String result = "";
        for (int i = 0; i < nonDuplicate.length(); i++) {

            String ch = nonDuplicate.charAt(i) + "";
            int Frequency = Library.Frequency(str,ch);
            result += ch +Frequency + " ";
        }

        return result;
    }
}
