package day31_BulkOperations;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,8,1,3,3,3,3,3));

            list.removeAll(Arrays.asList(3,1));
        System.out.println(list);

    }
}
