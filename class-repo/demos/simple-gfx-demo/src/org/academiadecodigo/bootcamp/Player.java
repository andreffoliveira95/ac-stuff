package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {

    private Picture picture;

    public Player(int x, int y, int size){
        picture = new Picture(x, y, "mario.png");
        picture.draw();
    }


    public void moveRight(){
        picture.translate(20, 0);
    }

    public void moveLeft(){
        picture.translate(-20, 0);
    }

}
