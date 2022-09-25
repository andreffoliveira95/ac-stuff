package enduro;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.io.File;

public class Game {

    private Grid grid;
    private HitableObject[] objects = new HitableObject[3];
    private int delay;
    private Player player;
    private Score score;
    private Highscore highscoreShow;
    private int highScore = 0;
    private final static double SPEEDUP = 500;
    public boolean isHigh = false;
    private Hearts[] hearts = new Hearts[3];
    private boolean endGame = false;
    FileManager fileManager;
    Soundtrack soundtrack;


    Game(int delay) {
        this.delay = delay;
        this.score = new Score();
        this.fileManager = new FileManager();
    }

    public void startScreen() {
        //Picture startScreen = new Picture(10,0,"StartScreen2.webp");
        //startScreen.draw();
    }

    public void init() {

        grid = new Grid(8, 20);
        grid.init();

        player = new Player(grid);
        player.draw();

        highScore = Integer.valueOf(fileManager.readFile());

        score.fillScoreArray();
        keyBoardInit();
    }

    public void start() throws InterruptedException {

        soundTrackInit();
        backgroundInit();
        scoreInit();
        heartInit();
        score.scoreInitialDisplay();
        highscoreShow = new Highscore(fileManager.readFile());
        highscoreShow.highscoreDisplay();

        while (!endGame) {

            moveBackground();

            if (grid.getRoadY() == 0) {
                reInit();
                scoreReInit();
                highscoreShow.highscoreDisplay();
                heartReInit();
            }


            moveAll();

            if ((score.getScore() % SPEEDUP == 0) && score.getScore() != 0) {
                increaseSpeed();
                score.setScore(0);
            }

            if (score.getScoreTracker() >= 2500) {
                youWin();
                break;
            }

            if (Hearts.lives <= 0) {
                youLose();
                break;
            }

            Thread.sleep(this.delay);
        }

        soundStop();

        saveHighscore();

    }

    public void moveAll() throws InterruptedException {

        boolean hasCollide;

        if (objects[0] != null) {

            for (HitableObject object : objects) {
                object.move();
                hasCollide = checkCollision(object);

                if (hasCollide && !object.isHit()) {
                    if (object instanceof Weed) {
                        if(!isHigh){
                            soundStop();
                            weedSound();
                        }
                        isHigh = true;
                        player.delete();
                        player.setCar(new Picture(player.getX(), player.getY(),"SnoopDawg.png"));
                        player.draw();
                    }
                    if (object instanceof Lollipop){
                        if(isHigh){
                            soundStop();
                            soundTrackInit();
                        }
                        isHigh = false;
                        player.setRandomCar();
                    }
                    object.hit();
                    if(object instanceof Gloves) {
                        soundtrack.fodase();
                    }
                    if (object instanceof Bullet) {
                        soundtrack.bullet();
                    }
                    if(object instanceof Coin) {
                        soundtrack.CoinSound();
                    }
                    if(!(object instanceof Coin) && !(object instanceof Gloves) && !(object instanceof Bullet) && !(object instanceof Beer)&& !(object instanceof Lollipop) && !(object instanceof Weed)) {
                        soundtrack.hit();
                    }
                    if(object instanceof Beer){
                        heartReInit();
                        soundtrack.glupGlup();
                    } else {
                        updateLives();
                    }
                    score.increaseScore(object);
                }
            }
        }
    }

    public void makeObjects() {

        objects[0] = ObjectFactory.getNewObject();
        objects[1] = ObjectFactory.getNewObject();
        objects[2] = ObjectFactory.getNewObject();

        while(objects[0].getX() == objects[1].getX() || objects[0].getX() == objects[2].getX() || objects[1].getX() == objects[2].getX()){
            objects[0].erase();
            objects[1].erase();
            objects[2].erase();

            objects[0] = ObjectFactory.getNewObject();
            objects[1] = ObjectFactory.getNewObject();
            objects[2] = ObjectFactory.getNewObject();
        }


    }

    public void increaseSpeed() {
        HitableObject.increaseSpeed();
    }

    public boolean checkCollision(HitableObject object) {
        return ((object.getX() < player.getMaxX() && object.getX() > player.getX() -80 || object.getMaxX() < player.getMaxX() && object.getX() > player.getX() - 80) &&
                (object.getY() > player.getY() && object.getY() < player.getMaxY() || object.getMaxY() > player.getY() && object.getMaxY() < player.getMaxY())) ;
    }

    public void keyBoardInit() {
        KeyboardLogic keyboardLogic = new KeyboardLogic(this);
        keyboardLogic.init();
        keyboardLogic.setPlayer(player);
    }

    public void soundTrackInit() {
        soundtrack = new Soundtrack();
        soundtrack.setFile(0);
        soundtrack.play();
        soundtrack.loop();
    }

    public void soundStop() {
        soundtrack.stop();
    }

    public void weedSound() {
        double r = Math.random();
        if (r < 0.3) {
            soundtrack.setFile(1);
        } else if (r > 0.3 && r < 0.6) {
            soundtrack.setFile(2);
        } else {
            soundtrack.setFile(3);
        }
        soundtrack.play();
        soundtrack.loop();
    }

    public void backgroundInit() {
        Rectangle scoresBackground = new Rectangle(10, 840, grid.getCols() * grid.getCellSize(), grid.getRows() * grid.getCellSize());
        scoresBackground.setColor(Color.BLACK);
        scoresBackground.fill();
    }

    public void reInit() {
        grid.setRoad2(new Picture(grid.getCols() / 4 * grid.getCellSize() + 10, -840, "Road.png"));
        grid.roadDraw();
        player.delete();
        player.draw();
        grid.setBackgroundLeft(new Picture(10, -840, "LeftBack.png"));
        grid.backgroundLeftDraw();
        grid.setBackgroundRight(new Picture(910, -840, "RightBack.png"));
        grid.backgroundRightDraw();
        makeObjects();
        Rectangle scoresBackground = new Rectangle(10, 840, grid.getCols() * grid.getCellSize(), grid.getRows() * grid.getCellSize());
        scoresBackground.setColor(Color.BLACK);
        scoresBackground.fill();


    }

    public void moveBackground() {
        grid.moveRoad();
        grid.moveBackLeft();
        grid.moveBackR();
    }

    public void heartInit() {
        for (int i = 0; i < hearts.length; i++) {
            hearts[i] = new Hearts();
            hearts[i].draw();
        }
    }

    public void heartReInit() {
        for (int i = 0; i < Hearts.lives; i++) {
            hearts[i].erase();
            hearts[i].draw();
        }
    }

    public void updateLives() {

        for (int i = hearts.length - 1; i >= Hearts.lives; i--) {
            hearts[i].erase();
        }

        if (Hearts.lives == 0) {
            endGame = true;
        }
    }

    public void scoreInit(){
        Picture scoreText = new Picture(400, 885, "arcade-font-writer.png");
        scoreText.draw();
    }

    public void scoreReInit(){
        scoreInit();
        score.scoreDisplay();
    }

    public void saveHighscore(){
        if(score.getScoreTracker() > highScore){
            highScore = score.getScoreTracker();
            String highScoreText = Integer.toString(highScore);
            if(highScore < 1000){
                fileManager.writeToFile("0000" + highScoreText);
            } else if(highScore >= 1000 && highScore < 10000){
                fileManager.writeToFile("000" + highScoreText);
            } else {
                fileManager.writeToFile("00" + highScoreText);
            }
        }
    }

    public void youWin() {
        player.delete();
        grid.fodaseAll();
        new Picture(10,-400,"youWin.jpg").draw();
        soundStop();
        soundtrack.vitory();
    }

    public void youLose() {
        player.delete();
        grid.fodaseAll();
        new Picture(10,0,"car-crash.jpeg").draw();
        new Picture(410,450,"game-over.png").draw();
        soundStop();
        soundtrack.lost();
    }
}

