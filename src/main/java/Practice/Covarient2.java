package Practice;

class User{
    User login(){
        System.out.println("Login in User");
        return this;
    }
}

class Client extends User{
    Client login(){
        System.out.println("Client Login");
        return this;
    }
}

public class Covarient2 {
    public static void main(String[] args) {

        Client c1 = new Client();
        c1.login();



    }
}
