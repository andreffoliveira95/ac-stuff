package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Main {


    public static void main(String[] args) {

        Rectangle box = new Rectangle(10, 10, 1000, 1000);
        box.setColor(Color.MAGENTA);
        box.draw();

        Player player = new Player(100, 50, 20);

        KeyboardLogic keyboardLogic = new KeyboardLogic();
        keyboardLogic.init();
        keyboardLogic.setPlayer(player);
    }
}
