package section_C;



class BankAccount {

    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful.........");
        } else {
            System.out.println("Invalid amount.........");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double Balance) {
    	this.balance=Balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(int accountNumber) {
    	this.accountNumber=accountNumber;
    }
}

public class Bank_Account{
    public static void main(String[] args) {

        BankAccount bank = new BankAccount(101, 5000);

        bank.deposit(2000);
        bank.withdraw(1000);

        System.out.println("Account Number: "+bank.getAccountNumber());
        System.out.println("Balance: "+bank.getBalance());
    }
}