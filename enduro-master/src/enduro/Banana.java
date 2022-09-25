package enduro;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Banana extends HitableObject {

    public Banana(Picture picture){
        super(picture);
        picture.draw();
    }

    @Override
    public void hit() {
        super.hit();

    }
}
