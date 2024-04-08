public class AccountManager {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws BalanceInsufficentException {
        if (balance >= amount){
            this.balance -= amount;
        }else {
            throw new BalanceInsufficentException("Bakiye yetersiz!!!");
        }

    }
}
