package day38_Constructors;

public class salaryCalculator {

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public salaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate){
        this.federalTaxRate =federalTaxRate;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.weeklyHours = weeklyHours;
    }
    public double salary(){
        return (hourlyRate*weeklyHours) * 52;
    }
    public double stateTax(){
        return salary() * stateTaxRate;
    }
    public double federalTax(){
        return salary() * federalTaxRate;
    }
    public double salaryAfterTax(){
        return salary() - (stateTax() + federalTax());
    }
    public String toString(){
        return "Hourly rate: $" + hourlyRate + ", Gross Salary: $" + salary() + ", State Tax: $" + stateTax() + ", Federal Tax: $" + federalTax()+ ", Net Salary: $" + salaryAfterTax();
    }
}
