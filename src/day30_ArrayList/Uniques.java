package day30_ArrayList;

import java.util.ArrayList;

public class Uniques {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);

        ArrayList<Integer> uniques = new ArrayList<>();


        for (int i = 0; i < list.size(); i++){
            int count = 0;

            for (int each: list){
                if (each == list.get(i)){
                    count++;
                }
            }
            if (count == 1){
                uniques.add(list.get(i));
            }
        }

        System.out.println(uniques);
    }
}
