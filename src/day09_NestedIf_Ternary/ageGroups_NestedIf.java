package day09_NestedIf_Ternary;

public class ageGroups_NestedIf {
    public static void main(String[] args) {

        int age = 70;
        String person = "";

        if (age > 0 && age < 150){
            if (age < 21){
                System.out.println("Teenager");
            }else if (age >= 22 && age <= 55){
                System.out.println("Adults");
            }else if (age >= 56 && age <= 150){
                System.out.println("Senior");
            }
        }else {
            System.out.println("invalid");
        }
        System.out.println(person);
    }
}
