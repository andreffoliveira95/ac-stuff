package enduro;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Lollipop extends HitableObject {

    public Lollipop(Picture picture){
        super(picture);
        picture.draw();
    }

    @Override
    public void hit() {
        super.hit();

    }
}
