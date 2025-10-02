package OOPs.Methodoverriding;

import java.util.Scanner;

class P {
    private String str = "naana";
    protected void display() {
        System.out.println("Parent dispaly()");

        
    }
}
class C extends P{
    @Override
    protected void display() {
        super.display();
        System.out.println("Procted method");
    }
}

public class Protected {
    public static void main(String[] args) {
        P p = new C();
        p.display();
    }
}
