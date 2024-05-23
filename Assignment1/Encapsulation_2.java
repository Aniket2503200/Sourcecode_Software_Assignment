public class Encapsulation_2 {
    private double balance;

    public Encapsulation_2(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        Encapsulation_2 account = new Encapsulation_2(1000.0);

        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(300.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}
