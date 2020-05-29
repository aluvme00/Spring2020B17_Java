package day31_BulkOperations;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

                    list.add(10);
                    list.add(20);
                    list.add(30);
                    list.add(40);


        boolean r1 = list.contains(10);
        boolean r2 = list.contains(20);
        boolean r3 = list.contains(60);

        boolean result= r1 == true && r2 == true && r3 == true;

        System.out.println(result);

        boolean result2 = list.containsAll(Arrays.asList(10,20,60));
        System.out.println(result2);


    }
}
