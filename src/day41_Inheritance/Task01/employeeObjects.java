package day41_Inheritance.Task01;

import day25_MethodsRecap.Test;

public class employeeObjects {

    public static void main(String[] args) {

        Developer dev1 = new Developer("Namik", 120000, 123, "Software Developer", 'M');

        dev1.fixingBug();
        dev1.coding();

        System.out.println(dev1);

        Tester tester1 = new Tester("Sun Woo Kim" , 95000,1234,"QA",'M');
        tester1.reportingBug();
        tester1.testing();

        System.out.println(tester1);

        businessAnalyst BA1 = new businessAnalyst("Kanna", 110000,145,'F');
        BA1.writingReq();
        BA1.gathering();
        System.out.println(BA1);

    }
}
