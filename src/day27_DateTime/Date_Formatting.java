package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_Formatting {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/dd");
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEE MMM/dd/yy");
        LocalDate date2 = LocalDate.of(1999,12,12);
        System.out.println(date2.format(dtf2));

        LocalDate date3 = LocalDate.now();
        System.out.println(date3.format(dtf2));


    }
}
