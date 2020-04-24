package day14_StringClass;

public class WebAddress {
    public static void main(String[] args) {

        String website = "WWW.cybertek.Govk";

        website = website.toLowerCase();

        boolean validEnding = website.endsWith(".com") || website.endsWith(".net")|| website.endsWith(".gov");

        if (website.startsWith("www.") && validEnding){
            System.out.println("Valid address");
        }else {
            System.out.println("Invalid address");
        }






    }
}
