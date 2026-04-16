public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
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
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(100);

        acc.deposit(50);
        System.out.println("After deposit: " + acc.getBalance());

        acc.withdraw(30);
        System.out.println("After withdrawal: " + acc.getBalance());

        acc.withdraw(200); // invalid
        System.out.println("Final balance: " + acc.getBalance());
    }
}
