package enduro;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class RoadBackground {
    Picture road;

    public RoadBackground() {
        road = new Picture(420,10,"Road.png");
    }

    public void show() {
        road.draw();
    }

    public void hide() {
        road.delete();
    }


}
