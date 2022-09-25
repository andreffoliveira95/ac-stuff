package enduro;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Highscore {

    private Picture[] highscoreDisplay;
    private Picture highscorePicture;
    private String highscoreText;
    private int xPos = 200;
    private int yPos = 910;


    public Highscore(String highScore) {
        this.highscoreText = highScore;
        this.highscoreDisplay = new Picture[highScore.length()];

    }

    public void highscoreDisplay() {

        highscorePicture = new Picture(100, yPos - 30, "highscore.png");
        highscorePicture.draw();

        int index = 0;

        for (int i = highscoreDisplay.length - 1; i >= 2; i--) {
            char number = highscoreText.charAt(i);
            highscoreDisplay[i] = new Picture(xPos - (index * 20), yPos, "0" + number + ".png");
            highscoreDisplay[i].draw();
            index++;
        }
    }
}
