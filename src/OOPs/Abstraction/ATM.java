package OOPs.Abstraction;

abstract class ATM2{
    abstract void withdraw(int amount);
    void insertCard(){
        System.out.println("Card Inserted");
    }
}

class SBIATM extends ATM2{
    void withdraw(int amount){
        System.out.println("SBI ATM : Withdraw " + amount);
    }
}
public class ATM {
    public static void main(String[] args) {
        ATM2 atm = new SBIATM();
        atm.insertCard();
        atm.withdraw(5000);
    }
}
