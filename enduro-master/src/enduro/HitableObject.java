package enduro;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class HitableObject extends MovableObject {

    private Picture picture;

    public static double speed = 20;

    private boolean isHit = false;

    public HitableObject(Picture picture) {
        this.picture = picture;
    }

    public boolean isHit() {
        return isHit;
    }

    public void hit() {
        isHit = true;
        picture.delete();

        if (this instanceof Coin || this instanceof Weed || this instanceof Lollipop) {
            return;
        }

        if (this instanceof Gloves) {
            if (Hearts.lives == 1) {
                Hearts.lives--;
            } else {
                Hearts.lives -= 2;
            }
            return;
        }

        if (this instanceof Beer) {
            if (Hearts.lives < 3) {
                Hearts.lives++;
            }
            return;
        }
        Hearts.lives--;
    }

    public int getX() {
        return picture.getX();
    }


    public int getY() {
        return picture.getY();
    }

    public int getMaxY() {
        return picture.getMaxY();
    }

    public int getMaxX() {
        return picture.getMaxX();
    }

    public void move() {
        if (this instanceof Bullet) {
            picture.translate(0, speed * 1.75);
        } else {
            picture.translate(0, speed);
        }

    }

    public static double getSpeed() {
        return speed;
    }

    public static void increaseSpeed() {
        speed = speed * 1.15;
    }

    public void erase() {
        picture.delete();
    }

}
