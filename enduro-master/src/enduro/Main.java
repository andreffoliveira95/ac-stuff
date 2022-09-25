package enduro;

public class Main {
    public static void main(String[] args) {

        Game g = new Game(50);
        //g.startScreen();

        g.init();

        try {
            g.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
