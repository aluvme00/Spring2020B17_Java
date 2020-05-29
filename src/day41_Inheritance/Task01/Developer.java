package day41_Inheritance.Task01;

public class Developer extends Employee{

    public Developer(String name, double salary, int id, String jobTitle, char gender){
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void fixingBug(){
        System.out.println(name + " is fixing bug");
    }
    public void coding(){
        System.out.println(name + " is coding");
    }

}
