package day37_Constructor;

public class HumanResources {

    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();

    public static void main(String[] args) {

        employee1.setInfo("Sun Woo", 1234, 4784561, "QA", 150000, 'F');
        employee2.setInfo("Sun Kim", 1234, 84784561, "QA", 150000, 'F');
        employee3.setInfo("Sun Soo", 1234, 474561, "QA", 150000, 'F');
        employee4.setInfo("Sun Ji", 1234, 84784561, "QA", 150000, 'F');
        employee5.setInfo("Sun Koo", 1234, 84784561, "QA", 150000, 'F');

    }

    static {
        employee1.setInfo("Sun Woo", 1234, 4784561, "QA", 150000, 'F');
        employee2.setInfo("Sun Kim", 1234, 84784561, "QA", 150000, 'F');
        employee3.setInfo("Sun Soo", 1234, 474561, "QA", 150000, 'F');
        employee4.setInfo("Sun Ji", 1234, 84784561, "QA", 150000, 'F');
        employee5.setInfo("Sun Koo", 1234, 84784561, "QA", 150000, 'F');

    }
}
