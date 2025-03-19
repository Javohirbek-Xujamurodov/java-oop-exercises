package oppExercises.ex2_5;

public class TestMain {
        public static void main(String[] args) {
            Customer customer = new Customer(101, "Alice", 'f');
            Account account = new Account(1001, customer, 500.0);

            System.out.println(account);

            account.deposit(200);
            System.out.println("After deposit: " + account);

            account.withdraw(100);
            System.out.println("After withdrawal: " + account);

            account.withdraw(700);
    }

}
