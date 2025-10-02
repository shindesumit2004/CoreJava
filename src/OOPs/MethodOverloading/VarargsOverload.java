package OOPs.MethodOverloading;

public class VarargsOverload {
    void show(int... a){
        System.out.println("Numbers : ");
        for (int i : a){
            System.out.println(i + " ");
        }
        System.out.println();
    }

    void show(String... s){
        System.out.println("String : ");
        for (String str : s){
            System.out.println(str + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VarargsOverload obj = new VarargsOverload();

        obj.show(1, 2, 3, 4);
        obj.show("Java", "C++", "Python");
    }
}
