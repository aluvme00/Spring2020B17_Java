package day41_Inheritance;

public class eBook extends book{

    public String size;
    public int pages;

    public void readBook(){
        System.out.println("Reading" + title);
    }
}
