package day37_Constructor;

public class students {

    String name;
    int age;
    char gender;
    String university;

    public students(String name, int age, char gender, String university){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;
    }

    public void setInfo(String name, int age, char gender, String university){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;
    }
    public String toString (){
        return "Name: " + name +" Age: "+ age + " Gender: "+gender+ " University: "+ university;
    }
}
