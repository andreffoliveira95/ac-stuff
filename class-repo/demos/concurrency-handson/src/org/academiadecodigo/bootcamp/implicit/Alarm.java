package org.academiadecodigo.bootcamp.implicit;

import java.util.Timer;
import java.util.TimerTask;

public class Alarm {

    private Timer timer;

    public static void main(String[] args) {

        int numberOfRings = 4;

        int ringInterval = 2;

        Alarm alarm = new Alarm();
        alarm.start(numberOfRings, ringInterval);

        System.out.println("MAIN HAS STOPPED");
        System.out.println("Main: " + Thread.currentThread().getName());

    }

    private void start(int numberOfRings, int ringInterval) {

        timer = new Timer();
        timer.scheduleAtFixedRate(new Ring(numberOfRings), 2000, ringInterval * 1000);
    }

    private class Ring extends TimerTask {

        int numRings;

        public Ring(int numRings) {
            this.numRings = numRings;
        }

        @Override
        public void run() {

            System.out.println("Other: " + Thread.currentThread().getName());

            System.out.println("Alarm is ringing!!! Wake up!!");

            numRings--;

            if (numRings == 0 ) {
                System.out.println("Alarm has stopped.");
                timer.cancel();
            }

        }
    }
}
