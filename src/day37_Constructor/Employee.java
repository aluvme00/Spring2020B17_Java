package day37_Constructor;

public class Employee {

    String name;
    long id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;

    public void setInfo(String name, long id, long ssn, String jobTitle, double salary, char gender){
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.gender = gender;

    }
    public String toString(){
        return "Name: " +name+", ID: " +id+", ssn: " + ssn+", Job Title: " + jobTitle+", Salary: " + salary + ", Gender: " + gender;
    }
}
