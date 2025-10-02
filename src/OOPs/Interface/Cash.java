package OOPs.Interface;
import java.util.Scanner;

interface Payment2{
    void pay();
}

class UpiPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Payment done using UPI.");
    }
}
class NetBankingPayment implements Payment2{
    @Override
    public void pay() {
        System.out.println("Payment done using Net Banking.");
    }
}
class PaymentCheckout{
    void payment(Payment payment)
    {
        payment.pay();
    }
}
public class Cash {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PaymentCheckout checkout = new PaymentCheckout();

        System.out.println("Choose payment method: ");
        System.out.println("1. UPI");
        System.out.println("2. Net Banking");
        System.out.println("Enter Choice");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                checkout.payment(new UpiPayment());
                break;
            case 2:
             //   checkout.payment(new NetBankingPayment());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
