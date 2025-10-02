package OOPs.Static;

class Bank{
    String customerName;
    int accountNo;
    static String bankName = "State Bank";

    Bank(String name, int acc){
        customerName = name;
        accountNo = acc;
    }
    void display(){
        System.out.println(customerName);
        System.out.println(accountNo);
        System.out.println(bankName);
    }
}
public class StaticBank {
    public static void main(String[] args) {
        Bank c1 = new Bank("Sumit", 101);
        Bank c2 = new Bank("Ravi" , 103);

        c1.display();
        System.out.println("--------------------------------------------------------");
        c2.display();
    }

}
