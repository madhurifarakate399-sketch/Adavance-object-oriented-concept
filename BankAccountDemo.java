
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}


class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    
    public void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }

    
    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit negative amount!");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }


    public void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw negative amount!");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.balanceEnquiry();
            account.deposit(500);
            account.withdraw(200);
            account.withdraw(2000); 
            account.deposit(-100); 
        } catch (LowBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction process completed.");
        }

        account.balanceEnquiry();
    }
}