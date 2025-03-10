package oppExercises.ex1_6;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.balance = balance;
        this.id = id;
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;

    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account otherAccount, int amount) {
        if (amount <= balance) {
            balance -= amount;
            otherAccount.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Accaunt{" +
                "id" + id +
                ",name=" + name +
                ",balance=" + balance +
                '}';
    }
}
