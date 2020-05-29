package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

                list.add(5);
                list.add(7);
                list.add(8);
                list.add(1,6);


        System.out.println(list);

        int[] arr = {1,2,3,4};

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("A");
        list1.add("B");
        list1.add(1,"C");
        list1.add(1,"D");

        list1.set(3,"F");
        list1.set(2,"E");

        System.out.println(list1);











        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

        int a =1;

        list3.remove(a);

        System.out.println(list3);

    }
}
