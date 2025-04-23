package lec1.oops;

public class BankAccount {
    private final String accountHolderName;
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        setBalance(initialBalance); // Validation
    }
    //getter and setter
    public  double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        if(balance>=0){
            this.balance=balance;
        }
        else{
            System.out.println("invalid balance");
        }
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        if(accountNumber>0){
            this.accountNumber=accountNumber;
        }
    }
    public void deposit(double amount){
        if(amount>0){
            setAccountNumber(200);
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if(amount>0 && balance>=amount){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
