package day35_Static;

public class StudentName {

    public static void main(String[] args) {

        student student1 = new student();
            student1.name = "Sun Woo";
        System.out.println(student1);

        student student2 = new student();
        System.out.println(student2);

        student.printSchoolName();

    }

}
