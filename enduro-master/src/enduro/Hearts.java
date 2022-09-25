package enduro;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class Hearts {
    public static int lives = 3;

    private Picture heart;

    private static int xPos = 915;
    private static int yPos = 865;



    public Hearts() {
        heart = new Picture(xPos, yPos,"heart.png");
        xPos+= 90;
    }

    public void draw() {
        heart.draw();
    }

    public void erase() {
        heart.delete();
    }

}
