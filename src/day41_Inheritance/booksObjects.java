package day41_Inheritance;

public class booksObjects {

    public static void main(String[] args) {

        eBook book1 = new eBook();
        book1.title = " Hamlet";
        book1.author = "Shakespeare";
        book1.price = 20;
        book1.size = "1.5GB";
        book1.pages = 432;

        System.out.println(book1);
        System.out.println("Size: " + book1.size);
        System.out.println("pages: " + book1.pages);
        book1.readBook();
        System.out.println("==============================================");

        audioBook book2 = new audioBook();
        book2.title = "Becoming";
        book2.author = "Michelle Obama";
        book2.price = 30;
        book2.length = "19 hours and  3 minutes";
        System.out.println(book2);
        System.out.println("Length of the audio book " + book2.length);

    }
}
