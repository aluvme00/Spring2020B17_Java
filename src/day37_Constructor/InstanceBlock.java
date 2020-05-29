package day37_Constructor;

public class InstanceBlock {

    {
        System.out.println("InstanceBlock");
    }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();
    }
}
