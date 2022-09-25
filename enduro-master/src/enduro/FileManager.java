package enduro;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.io.*;

public class FileManager {

    public void writeToFile(String highScore) {

        try {
            FileWriter fileWriter = new FileWriter("/Users/codecadet/Desktop/RoadToAviao/resources/highscore-register");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(highScore);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readFile() {

        try {
            FileReader fileWriter = new FileReader("/Users/codecadet/Desktop/RoadToAviao/resources/highscore-register");
            BufferedReader bReader = new BufferedReader(fileWriter);

            String line = "";

            line = bReader.readLine();
            bReader.close();

            return line;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
