package day25_MethodsRecap;

public class FindingFrequency {

    public static void main(String[] args) {

        String str1 = "java javajavajavajva";
        String str2 = "java";

        int count = 0;

        while (str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2, "");
        }

        System.out.println(count);

        String a = "pythonpythonpythonpythonpython";
        String b = "python";

        int num1 = Frequency(a,b);

        System.out.println(num1);





    }
    public static int Frequency(String str1, String str2) {
        int count = 0;

        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
        }
        return count;
    }
}
