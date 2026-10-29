package oops_concepts_task;


class BankAccount {
    private long accountNumber;
    private double balance;

    BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class Encap_Bank_Account {
    public static void main(String[] args) {

        BankAccount account =new BankAccount(123456789L, 5000);

        System.out.println("Account: " +account.getAccountNumber());
        System.out.println("Balance: " +account.getBalance());

        account.deposit(2000);
        account.withdraw(1500);

        System.out.println("Final Balance: " +account.getBalance());
    }
}