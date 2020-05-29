package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
               /*
                    list.add(30);
                    list.add(30);
                    list.add(30);
                    list.add(30);
                    list.add(30);
                    list.add(30);
                    list.add(30);
*/
        String[] names = {"k","f","r","t","t"};

        // names[5] = "R";
        System.out.println(Arrays.toString(names));

        ArrayList<String> nameList = new ArrayList<>();
                    nameList.addAll(Arrays.asList(names));

                    nameList.add("L");


        System.out.println("===========================================");

        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(numList);

    }
}
