package enduro;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class Soundtrack {

    Clip clip;
    URL sounds[] = new URL[11];

    public Soundtrack() {
        sounds[0] = getClass().getResource("/HighwayToHell.wav");
        sounds[1] = getClass().getResource("/WeedMusic.wav");
        sounds[2] = getClass().getResource("/Snoop_out.wav");
        sounds[3] = getClass().getResource("/Bob.wav");
        sounds[4] = getClass().getResource("/fodasse.wav");
        sounds[5] = getClass().getResource("/coin-sound.wav");
        sounds[6] = getClass().getResource("/Bullet.wav");
        sounds[7] = getClass().getResource("/Hit.wav");
        sounds[8] = getClass().getResource("/Glup.wav");
        sounds[9] = getClass().getResource("/Victory.wav");
        sounds[10] = getClass().getResource("/lost.wav");
    }

    public void setFile(int i) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(sounds[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }

    public void play() {
        clip.start();
    }

    public void loop() {
        clip.loop(clip.LOOP_CONTINUOUSLY);
    }

    public void stop() {
        clip.stop();
    }

    public void pause() throws InterruptedException {
        clip.wait(100);
    }

    public void CoinSound() {
        try {
            AudioInputStream aisz = AudioSystem.getAudioInputStream(sounds[5]);
            Clip coinClip = AudioSystem.getClip();
            coinClip.open(aisz);
            coinClip.start();
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }


    }

    public void fodase() {
        try {
            AudioInputStream aiss = AudioSystem.getAudioInputStream(sounds[4]);
            Clip fodaseClip = AudioSystem.getClip();
            fodaseClip.open(aiss);
            fodaseClip.start();
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }

    }

    public void bullet() {
        try {
            AudioInputStream aisp = AudioSystem.getAudioInputStream(sounds[6]);
            Clip bulletClip = AudioSystem.getClip();
            bulletClip.open(aisp);
            bulletClip.start();
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }

    }

    public void hit() {
        try {
            AudioInputStream aish = AudioSystem.getAudioInputStream(sounds[7]);
            Clip hitClip = AudioSystem.getClip();
            hitClip.open(aish);
            hitClip.start();
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }

    }

    public void glupGlup() {
        try {
            AudioInputStream aisg = AudioSystem.getAudioInputStream(sounds[8]);
            Clip glup = AudioSystem.getClip();
            glup.open(aisg);
            glup.start();
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }

    public void vitory() {
        try {
            AudioInputStream victorySound = AudioSystem.getAudioInputStream(sounds[9]);
            Clip vitory = AudioSystem.getClip();
            vitory.open(victorySound);
            vitory.start();
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }

    public void lost() {
        try {
            AudioInputStream aisg = AudioSystem.getAudioInputStream(sounds[10]);
            Clip lost = AudioSystem.getClip();
            lost.open(aisg);
            lost.start();
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }


}
