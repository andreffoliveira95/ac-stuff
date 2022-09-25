package enduro;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Coin extends HitableObject {

    private int scoreTracker = 0;

    public Coin(Picture picture){
        super(picture);
        picture.draw();
    }

    @Override
    public void hit() {
        super.hit();
        scoreTracker++;
    }

    public int getScoreTracker(){
        return scoreTracker * 100;
    }

}
