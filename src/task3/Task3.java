package task3;

public class Task3 {
    public static void main(String[] args) {
        Account myAccount = new Account(1122, 20000);
        myAccount.setAnnualInterestRate(4.5);

        myAccount.withdraw(2500);

        myAccount.depozit(3000);

        System.out.println("Account ID: " + myAccount.getId());
        System.out.println("Final Balance: $" + myAccount.getBalance());
        System.out.println("Monthly Interest: $" + myAccount.getMonthlyInterest());
    }
    }
