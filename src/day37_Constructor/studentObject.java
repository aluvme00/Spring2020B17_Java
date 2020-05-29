package day37_Constructor;

public class studentObject {

    public static void main(String[] args) {
        students students1 = new students("Sun Woo Kim", 29, 'M', "George Mason");
        System.out.println(students1);
        students students2 = new students("Keded",34,'F',"Harvard");
        System.out.println(students2);
    }

}
