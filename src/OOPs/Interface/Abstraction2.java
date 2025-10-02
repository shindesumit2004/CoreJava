package OOPs.Interface;
// Common method in abstraction

interface Printable{
    void print();
}

class Document implements Printable{
    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}

class Image implements Printable{
    @Override
    public void print() {
        System.out.println("Printing image...");
    }
}
public class Abstraction2 {
    public static void main(String[] args) {
        Printable p1 = new Document();
        Printable p2 = new Image();

        p1.print();
        p2.print();
    }
}
