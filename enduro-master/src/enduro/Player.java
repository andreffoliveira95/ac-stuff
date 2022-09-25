package enduro;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {

    private Picture car;
    private Grid grid;

    private int lives;

    public Player(Grid grid) {
        car = new Picture((grid.getWidth() / 2) - grid.getCellSize() / 2, 840 - 10 - grid.getCellSize(), "taxi.png");
        this.grid = grid;
        lives = 3;
    }

    public void draw() {
        car.draw();
    }

    public void delete() {
        car.delete();
    }

    public int getY() {
        return car.getY();
    }

    public int getX() {
        return car.getX();
    }

    public int getMaxY() {
        return car.getMaxY();
    }

    public int getMaxX() {
        return car.getMaxX();
    }

    public void moveRight() {
        if (car.getX() < 745) {
            car.translate(10, 0);
        }
    }

    public void moveLeft() {
        if (car.getX() > 350) {
            car.translate(-10, 0);
        }
    }

    public void setCar(Picture car) {
        this.car = car;
    }

    public void setRandomCar() {
        int r = (int) Math.floor(Math.random() * 5);
        car.delete();
        switch (r) {
            case 0:
                setCar(new Picture(car.getX(), car.getY(),"plane.png"));
                car.draw();
                break;
            case 1:
                setCar(new Picture(car.getX(), car.getY(),"mario-kart.png"));
                car.draw();
                break;
            case 2:
                setCar(new Picture(car.getX(), car.getY(),"bike.png"));
                car.draw();
                break;
            case 3:
                setCar(new Picture(car.getX(), car.getY(),"longboard.png"));
                car.draw();
                break;
            case 4:
                setCar(new Picture(car.getX(), car.getY(),"horacio.png"));
                car.draw();
                break;
        }
    }
}
