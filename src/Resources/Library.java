package Resources;

public class Library { public static void main(String[] args) {





    String str = "ABABABABAB";



    String result =  "";      //AB



    for(int i = 0; i < str.length(); i++){

        char ch = str.charAt(i); //B

        if( !result.contains(""+ch) ){

            result += ch;

        }



    }



    System.out.println(result);





    String str2 = "ABCABCABC";



    String result2 = RemoveDuplicates(str2);  //ABC



    System.out.println(result2);





}



    public static String RemoveDuplicates(String str){

        String result =  "";      //AB



        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i); //B

            if( !result.contains(""+ch) ){

                result += ch;

            }



        }



        return result;

    }

    public static void Reverse(String[] args) {

        String str = "Java is fun";
        int lastIndex = str.length()-1;
        for (int i = lastIndex; i >= 0 ; i--){
            System.out.print(str.charAt(i));
        }
    }

    public static int Frequency(String str1, String str2) {
        int count = 0;

        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
        }
        return count;
    }

    public static String FrequencyOfChars(String str) {
        String nonDuplicate = Library.RemoveDuplicates(str);
        String result = "";
        for (int i = 0; i < nonDuplicate.length(); i++) {

            String ch = nonDuplicate.charAt(i) + "";
            int Frequency = Library.Frequency(str, ch);
            result += ch + Frequency + " ";
        }

        return result;
    }
    public static int frequency (String str, char ch) {
        char arr[] = str.toCharArray();
        int count = 0;
        for (char each : arr) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }
    public static String Unique(String str) {
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
