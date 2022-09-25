package enduro;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class RubberDuck extends HitableObject {

    public RubberDuck(Picture picture){
        super(picture);
        picture.draw();
    }

    @Override
    public void hit() {
        super.hit();

    }
}
