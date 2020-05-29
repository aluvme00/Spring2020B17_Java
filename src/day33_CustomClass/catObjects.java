package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class catObjects {

    public static void main(String[] args) {

        cat cat1 = new cat();
        cat1.setCatInfo("Siemes", "White", "Sasha", 2);
        cat cat2 = new cat();
        cat2.setCatInfo("scottish", "Beige", "Bobo",7);
        cat cat3 = new cat();
        cat3.setCatInfo("Calico","brown-white","Cinnamon", 6);


        ArrayList<cat> catList = new ArrayList<>();

        catList.addAll(Arrays.asList(cat1,cat2,cat3));

        for (int i = 0; i < catList.size(); i++){
            System.out.println(catList.get(i));
        }

        System.out.println("===================================================");

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();
        System.out.println("===================================================");
        cat1.eat("cat treats");
        cat2.eat("fish");
        cat3.eat("sish kabob");
        System.out.println("===================================================");
        cat1.drink("water");
        cat2.drink("milk");
        cat3.drink("coffee");

    }

}
