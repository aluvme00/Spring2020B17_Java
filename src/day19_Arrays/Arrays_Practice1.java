package day19_Arrays;

public class Arrays_Practice1 {

    public static void main(String[] args) {

        String[] names = {"Kuzzat", "Asiya", "Saim", "Akbar", "Marufjon", "Guljannat" };

        String a = names[1];

        System.out.println(a);

        for (int i = 0; i <=6; i++ ){
            String name = names[i];
            System.out.println(name);
        }

        String[] emails = {"yahoo", "gmail", "hotmail", "outlook"};

        for (int i = 0; i <= 3; i++){
            String email = emails[i];
            if (email.endsWith("gmail")) {
                System.out.println(email);
            }
        }

    }
}
