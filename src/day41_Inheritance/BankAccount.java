package day41_Inheritance;

public class BankAccount {

    public static String bankName = "Bank ofAmerica";
    public String firstName;
    public String lastName;

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName){
        this.lastName = lastName;
        this.firstName = firstName;
        this.accountHolder = firstName + " "+ lastName;
    }
    public String getAccountHolder(){
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String firstName, String lastName){
        this.accountHolder = firstName + " " + lastName;
    }

    public void depositing (int amount){
        setBalance(balance + amount);
    }

    public void withdrawing(int amount){
        setBalance(balance - amount);
    }

    public void checkBalance(){
        System.out.println("Available balance: " + getBalance());
    }

    public String toString (){
        return "Full name: " + getAccountHolder() + ", Balance: " + getBalance();
    }
}
