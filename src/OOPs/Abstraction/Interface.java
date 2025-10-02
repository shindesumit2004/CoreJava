package OOPs.Abstraction;

interface Payment {
    void pay();
}
abstract class UPI implements Payment {
    abstract void scanQR();
}
    class GPay extends UPI {

        void scanQR() {
            System.out.println("Scanning QR....");
        }

    @Override
    public void pay() {
        System.out.println("Payment successful via GPay");
    }
}
public class Interface {
    public static void main(String[] args) {
        Payment p = new GPay();
        p.pay();
    }
}
