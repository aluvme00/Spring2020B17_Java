package day37_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAzerbaizan {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(HumanResources.employee3);
        list.add(HumanResources.employee5);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
