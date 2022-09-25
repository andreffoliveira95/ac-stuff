package enduro;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Bullet extends HitableObject {

    public Bullet(Picture picture){
        super(picture);
        picture.draw();
    }

    @Override
    public void hit() {
        super.hit();
    }
}
