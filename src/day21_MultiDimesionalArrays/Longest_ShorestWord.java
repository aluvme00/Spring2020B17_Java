package day21_MultiDimesionalArrays;

import javax.xml.namespace.QName;

public class Longest_ShorestWord {

    public static void main(String[] args) {

        String[] names = {"Reem","omeaer","edwef","efsdascwe","refdscc"};

        int maxLengthString = names[0].length();
        int minLengthString = names[0].length();
        String longest = "";
        String shortest = "";
        for (int i = 1; i <= names.length-1; i++){
            if (names[i].length() > maxLengthString){
                maxLengthString = names[i].length();
                longest = names[i];
            }
            if (names[i].length() < minLengthString){
                minLengthString = names[i].length();
                shortest = names[i];
            }
        }

        System.out.println(longest);
        System.out.println(shortest);

    }
}
