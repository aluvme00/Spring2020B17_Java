package day09_NestedIf_Ternary;

public class Ternary2 {
    public static void main(String[] args) {
        String result = "";

        String result2 = (0 > 10) ? " 9 is greater" : "10 is greater";

        System.out.println(result2);

        int ageOfPerson = 20;
        String eligibleToVote = "";

        String eligibleToVote2 = (ageOfPerson >= 18) ? "Yes" : "No";

        System.out.println(eligibleToVote2);
    }
}
