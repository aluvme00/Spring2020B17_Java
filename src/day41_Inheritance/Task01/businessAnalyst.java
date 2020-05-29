package day41_Inheritance.Task01;

public class businessAnalyst extends Employee{
    public businessAnalyst(String name, double salary, int id, char gender){
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.jobTitle = "BusinessAnalyst";
        this.salary = salary;
    }
    public void writingReq(){
        System.out.println(name + " is writing requirement");
    }
    public void gathering(){
        System.out.println(name + " is gathering");
    }


}
