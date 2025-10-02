package OOPs.MethodOverloading;

public class CharIntOverload {
    void print(char c) {
        System.out.println("Character : " + c);
    }
    void print(int n) {
        System.out.println("Integer : " + n);
    }

    public static void main(String[] args) {
        CharIntOverload obj = new CharIntOverload();
        obj.print('A');
        obj.print(100);
    }
}
