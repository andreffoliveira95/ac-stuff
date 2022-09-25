package enduro;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Weed extends HitableObject {

    public Weed(Picture picture){
        super(picture);
        picture.draw();
    }

    @Override
    public void hit() {
        super.hit();

    }
}
