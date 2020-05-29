package day35_Static;

public class student {

    String name;
    int id;
    double gpa;

    static String school = "Cybertek";

    public void setInfo(String name, int id, double gpa){
        this.name = name;
        this.gpa = gpa;
        this.id = id;

    }

    public static void printSchoolName(){
        System.out.println("School name is " + school);
    }

    public String toString(){
        return "Name: " +name+ ", School Name: "+ school;
    }
}
