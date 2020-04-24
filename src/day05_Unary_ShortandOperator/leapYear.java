package day05_Unary_ShortandOperator;

public class leapYear {

    // Ex
            // year = 2020 ==> short;
    // LeapYear = true/ false;

    public static void main(String[] args) {

        short year = 2020;

        //leapyear: year % 4 == 0
        // if returns true ==> leapyear, if it returns false ==> not leapyear

        boolean leapYear = year % 4 == 0; // if the year can be devided by 4 without any reminder, then it is leapYear

        System.out.println( year + " is leap year: "+ leapYear);
    }
}
