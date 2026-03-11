// Класс BankAccount (предоставляется преподавателем)
public class BankAccont {
    private String owner;
    private double balance;

    public BankAccont(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public void resetBalance() {
        this.balance = 0.0;
    }
}
