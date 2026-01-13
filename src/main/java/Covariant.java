

//object
class A{
   Object a1(){
      return  new Object();
    }
    A obj2(){
        return new A();
    }
}
class B extends A{
    Object a1(){
        return  new Object();
    }
    A obj2(){
        System.out.println("hi");
        return new C();
    }
}

class C  extends B{
    Object a1(){
       return new C();
    }
    B obj2(){
        return new C();
    }
}


public class Covariant {
    public static void main(String[] args) {
        C c=new C();
        c.obj2();


    }
}
