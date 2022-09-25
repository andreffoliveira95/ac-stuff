package enduro;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardLogic implements KeyboardHandler {
    private Keyboard keyboard;

    private Player player;

    private Game game;

    public KeyboardLogic(Game game) {
        this.game = game;
    }

    public void init() {

        keyboard = new Keyboard(this);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent start = new KeyboardEvent();
        start.setKey(KeyboardEvent.KEY_S);
        start.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent killGame = new KeyboardEvent();
        killGame.setKey(KeyboardEvent.KEY_Q);
        killGame.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(right);
        keyboard.addEventListener(left);
        keyboard.addEventListener(start);
        keyboard.addEventListener(killGame);

    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                if (!game.isHigh) {
                    player.moveLeft();
                    break;
                }
                player.moveRight();
                break;
            case KeyboardEvent.KEY_RIGHT:
                if (!game.isHigh) {
                    player.moveRight();
                    break;
                }
                player.moveLeft();
                break;
            /*case KeyboardEvent.KEY_S:
                try {
                    game.start();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;*/
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }
}
