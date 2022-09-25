package enduro;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Grid {
    public static final int PADDING = 10;
    private int cellSize = 150;
    private int cols;
    private int rows;
    private Rectangle background;
    private Picture backgroundLeft;
    private Picture backgroundRight;
    private Picture road2;

    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        background = new Rectangle(PADDING, PADDING, getCols() * getCellSize(), getRows() * getCellSize());
        background.setColor(Color.BLACK);
        background.fill();
    }


    public void init() {

        backgroundLeft = new Picture(PADDING,-840,"LeftBack.png");
        backgroundLeft.draw();

        backgroundRight = new Picture(900 + PADDING,-840,"RightBack.png");
        backgroundRight.draw();

        road2 = new Picture(getCols() / 4 * getCellSize() + 10, -840, "Road.png");
        road2.draw();
    }

    public void backgroundRightDraw() {
        backgroundRight.draw();
    }


    public void setBackgroundRight(Picture backgroundRight) {
        this.backgroundRight = backgroundRight;
    }

    public void moveBackR() {
        backgroundRight.translate(0,20);
    }

    public int getCellSize() {
        return cellSize;
    }

    public int getCols() {
        return this.cols;
    }

    public int getRows() {
        return this.rows;
    }

    public int getWidth() {
        return background.getWidth();
    }

    public int getHeight() {
        return background.getHeight();
    }

    public int getX() {
        return background.getX();
    }

    public int getY() {
        return background.getY();
    }

    public int getRoadX() {
        return road2.getX();
    }

    public int getRoadY() {
        return road2.getY();
    }

    public void setRoad2(Picture road2) {
        this.road2 = road2;
    }

    public void roadDraw() {
        road2.draw();
    }

    //public void roadDelete();

    public void moveRoad() {
        road2.translate(0, 20);
    }

    public void setBackgroundLeft(Picture backgroundLeft) {
        this.backgroundLeft = backgroundLeft;
    }

    public void backgroundLeftDraw() {
        backgroundLeft.draw();
    }

    public void backLeftDel() {
        backgroundLeft.delete();
    }

    public void loadBackLeft() {
        backgroundLeft.load("BackgroundLeftNew.png");
    }

    public void moveBackLeft() {
        backgroundLeft.translate(0,20);
    }

    public int backLeftGetY() {
        return backgroundLeft.getY();
    }

    public void fodaseAll() {
        background.delete();
        backgroundLeft.delete();
        backgroundRight.delete();
        road2.delete();
    }


}
