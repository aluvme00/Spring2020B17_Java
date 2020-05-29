package day41_Inheritance.Task01;

public class Tester extends Employee{

    public void reportingBug(){
        System.out.println(name + " is reporting a bug");
    }
    public void testing(){
        System.out.println(name + " is testing");
    }
    public Tester(String name, double salary, int id, String jobTitle, char gender){
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
}
