package OOPs.Methodoverriding;

class Parent4 {
    String getMessage(){
        return "Message from Parent";
    }
}
class Childs extends Parent4{
    String getMessage(){
        return "Message from Child";
    }
}

public class SameReturnTypes {
    public static void main(String[] args) {
        Parent4 p = new Childs();
        System.out.println(p.getMessage());

    }
}
