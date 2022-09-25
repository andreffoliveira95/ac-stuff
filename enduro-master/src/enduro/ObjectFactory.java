package enduro;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class ObjectFactory {


    public static HitableObject getNewObject() {

        int randomNumberObject = (int) Math.floor(Math.random() * ObjectType.values().length);
        ObjectType objectType = ObjectType.values()[randomNumberObject];


        switch (objectType) {
            case BANANA:
                return new Banana(new Picture(getColPos(), 0, "banana.png"));
            case BEER:
                return new Beer(new Picture(getColPos(), 0, "beer.png"));
            case BLOOPER:
                return new Blooper(new Picture(getColPos(), 0, "blooper.png"));
            case COIN:
                return new Coin(new Picture(getColPos(), 0, "coin.png"));
            case GLOVES:
                return new Gloves(new Picture(getColPos(), 0, "gloves.png"));
            case GREENSHELL:
                return new GreenShell(new Picture(getColPos(), 0, "green-shell.png"));
            case GOOMBA:
                return new Goomba(new Picture(getColPos(), 0, "goomba.png"));
            case FRIES:
                return new Goomba(new Picture(getColPos(), 0, "fries.png"));
            case REDSHELL:
                return new RedShell(new Picture(getColPos(), 0, "red-shell.png"));
            case RUBBERDUCK:
                return new RedShell(new Picture(getColPos(), 0, "rubber-duck.png"));
            case BULLET:
                return new Bullet(new Picture(getColPos(), 0, "bullet.png"));
            case WEED:
                return new Weed(new Picture(getColPos(), 0, "weed-joint.png"));
            case LOLLIPOP:
                return new Lollipop(new Picture(getColPos(), 0, "lollipop.png"));
            default:
                return null;
        }

    }


    public static int getColPos() {
        int randomNumberGrid = (int) Math.floor(Math.random() * 4);

        switch (randomNumberGrid) {
            case 0:
                return 400;
            case 1:
                return 510;
            case 2:
                return 640;
            case 3:
                return 760;
            default:
                return 0;
        }
    }

}
