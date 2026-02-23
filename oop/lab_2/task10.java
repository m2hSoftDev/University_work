// Parent Class
class Account {
    String accountId;
    double balance;

    public Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Account " + accountId + " balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(String accountId, double balance, double interestRate) {
        super(accountId, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance += balance * interestRate;
        System.out.println("Interest added to account " + accountId);
    }
}

class CheckingAccount extends Account {
    double overdraftLimit;

    public CheckingAccount(String accountId, double balance, double overdraftLimit) {
        super(accountId, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew " + amount + " from checking account " + accountId);
    }
}

public class task10 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000.0, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount("CA001", 500.0, 200.0);

        savingsAccount.displayBalance();
        savingsAccount.addInterest();
        savingsAccount.displayBalance();

        checkingAccount.displayBalance();
        checkingAccount.withdraw(700.0);
        checkingAccount.displayBalance();
    }
}