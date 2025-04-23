package lec1.oops;

public  class Encapsulation{
    public static void main(String[] args) {
        BankAccount acc=new BankAccount("a",1212,21321);
        System.out.println("Account Holder: " + acc.getAccountHolderName());
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: ₹" + acc.getBalance());

        acc.deposit(1000);
        acc.withdraw(2000);
        acc.setAccountNumber(8888);

        System.out.println("\nAfter transactions:");
        System.out.println("Updated Balance: ₹" + acc.getBalance());
    }

}