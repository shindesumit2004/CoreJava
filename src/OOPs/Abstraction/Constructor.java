package OOPs.Abstraction;

abstract class Game{
    abstract void play();
    Game(){
        System.out.println("Game Started...");
    }

}

class Cricket extends Game{
    @Override
    void play() {
        System.out.println("Playing Cricket");
    }
}

public class Constructor {

    public static void main(String[] args) {
        Game g = new Cricket();
        g.play();
    }
}
