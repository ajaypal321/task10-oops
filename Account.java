package Opps;
class Account {
    private double balance;

    public Account() {
        balance= balance;// Default balance is 0.0
    }

    public Account(double initialbalance) {
        balance = initialbalance;
    }
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

   
}



