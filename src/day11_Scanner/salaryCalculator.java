package day11_Scanner;

import java.util.Scanner;

public class salaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your salary: ");
        int salary = input.nextInt();

        System.out.println(" Enter the state tax");
        byte stateTax = input.nextByte();
        double stateTaxPercentage = stateTax/100.0;

        System.out.println("Enter the federal tax");
        byte federalTax = input.nextByte();
        double federalTaxPercentage = federalTax/100.0;

        double TotalTax = (federalTaxPercentage + stateTaxPercentage) * salary;

        double salaryAfterTax = salary - TotalTax;

        System.out.println("your salary after tax is: $" + salaryAfterTax);
    }
}
