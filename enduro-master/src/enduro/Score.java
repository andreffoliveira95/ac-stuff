package enduro;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Score {

    private int score = 0;
    private int scoreTracker = 0;
    private int scoreCounter = 0;
    private int xPos = 600;
    private int yPos = 885;

    private Picture[] scoreDisplay = new Picture[5];

    private final static int COIN_SCORE = 100;

    public int getScore() {
        return score;
    }

    public int getScoreTracker() {
        return scoreTracker * 100;
    }

    public void increaseScore(HitableObject object) {
        if (object instanceof Coin) {
            score += COIN_SCORE;
            scoreTracker++;
            scoreCounter++;
            scoreDisplay();
        }
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void fillScoreArray() {
        for (int i = 0; i < scoreDisplay.length; i++) {
            scoreDisplay[i] = new Picture(xPos + i * 40, yPos, "0.png");
        }
    }

    public void scoreInitialDisplay() {
        for(int i = 0; i < scoreDisplay.length; i++){
            if(i < 2){
                scoreDisplay[i] = new Picture(xPos + (i * 40), yPos, "black.jpeg");
            }
            scoreDisplay[i].draw();
        }
    }

    public void scoreDisplay() {
        String scoreString = scoreCounter + "";

        if (scoreCounter < 10){
            scoreDisplay[2].delete();
            scoreDisplay[2] = new Picture(xPos + 2 * 40, yPos, scoreString + ".png");

        } else if (scoreCounter >= 10 && scoreCounter < 100) {

            for (int i = 0; i < 2; i++) {
                String element = scoreString.charAt(i) + "";
                scoreDisplay[i + 1].delete();
                scoreDisplay[i + 1] = new Picture(xPos + (i + 1) * 40, yPos, element + ".png");
            }

        } else {
            for (int i = 0; i < 3; i++) {
                String element = scoreString.charAt(i) + "";
                scoreDisplay[i].delete();
                scoreDisplay[i] = new Picture(xPos + (i * 40), yPos, element + ".png");
            }

        }


        for(int i = 0; i < scoreDisplay.length; i++){
            if(i > 2){
                scoreDisplay[i] = new Picture(xPos + (i * 40), yPos, "0.png");
            }
            scoreDisplay[i].draw();
        }
    }

}

