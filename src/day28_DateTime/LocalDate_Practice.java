package day28_DateTime;

import java.time.LocalDate;

public class LocalDate_Practice {

    public static void main(String[] args) {

        String[] friends = {"Kim","Sun","Woo"};
        LocalDate KimBirthday = LocalDate.of(2020,3,5);
        LocalDate SunBirthday = LocalDate.of(2003,4,5);
        LocalDate WooBirthday = LocalDate.of(2002,6,23);

        LocalDate[] birthdays = {KimBirthday,SunBirthday,WooBirthday};

        for (int i = 0; i < friends.length; i++){
            String name = friends[i];
            LocalDate date = birthdays[i];
            System.out.println( name + "'s birthday is " + date);
        }

    }
}
