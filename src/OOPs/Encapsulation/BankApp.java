package OOPs.Encapsulation;

class Account{
   private String accountHolder;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("You have deposit" + amount +"rs and now balance is"+balance);
    }
    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("You have withdraw"+amount+"rs and now balances is "+balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        Account account = new Account();

        account.setAccountHolder("Deepak");
        account.deposit(100000);
        account.withdraw(40000);
    }

}
