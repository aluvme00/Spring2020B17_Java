package day16_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        String upperCase = "";
        String lowerCase = "";

        for (char ch = 'A'; ch <='Z'; ch++){
            upperCase += ch;
        }
        System.out.println(upperCase);

        for (char ch1 = 'a'; ch1<='z'; ch1++){
            lowerCase+=ch1;
        }
        System.out.println(lowerCase);
        String result = "";
        for (int i = 0; i <= upperCase.length()-1; i++){
            result+= upperCase.charAt(i)+""+lowerCase.charAt(i)+" ";
        }
        System.out.println(result+"");
    }
}
