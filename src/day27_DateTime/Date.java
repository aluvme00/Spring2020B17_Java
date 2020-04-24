package day27_DateTime;

import java.time.LocalDate;

public class Date {

    public static void main(String[] args) {

        LocalDate date1= LocalDate.of(2020,10,25);

        System.out.println(date1);

        LocalDate Birthday = LocalDate.of(1991,12,18);

        System.out.println(Birthday);

        boolean result1 = date1.isAfter(Birthday);
        System.out.println(result1);

        boolean result2 = date1.isBefore(Birthday);
        System.out.println(result2);

        boolean result3 = date1.isEqual(Birthday);
        System.out.println(result3);

        boolean result4 = Birthday.isLeapYear();
        System.out.println(result4);

        System.out.println("====================================================");

        LocalDate now = LocalDate.now();
        System.out.println("Today is" + now);

        LocalDate birthday = LocalDate.of(1990,04,25);
        int month = birthday.getMonthValue();
        int days = birthday.getDayOfMonth();

        String str = now.toString();
        System.out.println(str.replace("-"," "));
    }
}
