package OOPs.Basic;

class Animal3 {

    String color;
    int age;
    void initObj(String c, int a)
    {
        color = c;
        age = a;
    }
    void display()
    {
        System.out.println(color +" "+ age);
    }

    public static void main(String[] args) {
        Animal3 buzo = new Animal3();
        buzo.initObj("black",20);
        buzo.display();
    }


}
