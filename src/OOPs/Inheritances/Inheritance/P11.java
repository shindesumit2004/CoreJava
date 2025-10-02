package OOPs.Inheritances.Inheritance;

class A {
    int i;

    A(int i){
        System.out.println("Class A Constructor");
    }
}

class B extends A {
    int j;

    public B(){
        super(10);
        System.out.println("Class B Constructor");
    }

}


