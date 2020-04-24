package day14_StringClass;

public class practice {
    public static void main(String[] args) {

        String gmail ="cybertekschool@gmail.com";

        String userInputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userInputGmail);

        if (result){
            System.out.println("Logged in");
        }
    }
}
