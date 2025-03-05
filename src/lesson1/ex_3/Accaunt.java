package lesson1.ex_3;

public class Accaunt {
    int id;
    double balance;
    double annualInterestRate;

    Accaunt() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }

    Accaunt(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Error: Insufficient funds.");
        }
    }

    public void depozit(double depozit) {
        if (depozit <= balance) {
            balance += depozit;
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

}
