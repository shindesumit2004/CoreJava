/*package OOPs.Encapsulation;

class BankAccount1{
    private String accountNumber;
    private String accountHolderName;
    private int age;
    private String branch;
    private double balance;
    private String accountType;
    private double ifscCode;
    private String nominee;

    public BankAccount1(String accountNumber, String accountHolderName, int age, String branch, String accountType, double balance,double ifscCode, String nominee){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.age = age;
        this.branch = branch;
        this.balance = balance;
        this.accountType = accountType;
        this.ifscCode = ifscCode;
        this.nominee = nominee;

    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAge() {
        return age;
    }

    public String getBranch() {
        return branch;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void getBranch(String branch) {
        this.branch = branch;
    }

    public void getIfscCode(double ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getNominee() {
        return nominee;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited : " + amount);
        }else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw : " + amount);

        }else{
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {

        BankAccount1 b = new BankAccount1();


    }

}*/
