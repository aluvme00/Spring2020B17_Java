package day29_Wrapper_ArrayList;

public class Wrapper_Practice {

    public static void main(String[] args) {

        String [] arr = {"1","2.5","3","3.5","4.5"};

        double max = Double.MIN_VALUE;

        for (String each :arr){
            double num = Double.parseDouble(each);
            if (max < num){
                max = num;
            }
        }

        System.out.println(max);

    }
}
