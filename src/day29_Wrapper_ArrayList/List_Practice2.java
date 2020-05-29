package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice2 {

    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList<>();

        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) > max){
                 max = list.get(i);
            }
        }
        System.out.println(max);
    }
}
