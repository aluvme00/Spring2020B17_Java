package day38_Constructors;

public class EmployeeSalary {

    public static void main(String[] args) {

        salaryCalculator salaryCalculator1 = new salaryCalculator(50,40,0.0825,0.2);

        System.out.println( salaryCalculator1.salary());

        System.out.println(salaryCalculator1);

        salaryCalculator salaryCalculator2 = new salaryCalculator(62,40,0.0875,0.26);
        System.out.println(salaryCalculator2);
    }
}
