package day23_methods;

public class Unique_String {

    public static void main(String[] args) {

        String[] arr = {"A", "B", "B", "C", "C", "D","D"};

        for (String each : arr){
            int count2 = 0;

            for (int i = 0; i <= arr.length-1 ; i++){
                if (arr[i].equals(each)  ){
                    count2++;
                }
            }
            if (count2 ==1 ){
                System.out.println(each);
            }
        }



        System.out.println("====================================================");
        for (String each2: arr){


            int count = 0;

            for (String each : arr){
                if (each.endsWith(each2)){
                count++;
            }
        }

            if (count == 1) {
                System.out.println(each2);
            }
        }
    }
}
