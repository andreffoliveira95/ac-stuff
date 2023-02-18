package org.academiadecodigo;

/**
 * Rock Paper Scissors game class
 */
public class Game {

    private int maxRounds;
    private int rounds = 0;

    private Player player1;
    private Player player2;

    public Game(int maxRounds, Player player1, Player player2) {
        this.maxRounds = maxRounds;
        this.player1 = player1;
        this.player2 = player2;
    }



    /**
     * Starts the game
     */
    public void start() {

       /* while(rounds < maxRounds) {
            playRound();
        }*/

        playRound1();

        displayResults();
    }


    private void playRound1(){


        for (int rounds = 0; rounds < maxRounds; rounds++) {

            GameHand p1Hand = player1.chooseHand();
            GameHand p2Hand = player2.chooseHand();

            System.out.println(player1.getName() + " has " + player1.getVictories()+ " victories, now chooses " + p1Hand);
            System.out.println(player2.getName() + " has " + player2.getVictories()+ " victories, now chooses " + p2Hand);

            if(p1Hand == p2Hand){
                System.out.println("It's a tie, doesn't count!!");
                rounds--;
                continue;
            }

            if(p1Hand == GameHand.PAPER && p2Hand == GameHand.ROCK ||
            p1Hand == GameHand.ROCK && p2Hand == GameHand.SCISSORS ||
            p1Hand == GameHand.SCISSORS && p2Hand == GameHand.PAPER) {

                System.out.println(player1.getName() + " wins this round!");
                player1.win();
            } else {
                System.out.println(player2.getName() + " wins this round!");
                player2.win();
            }



        }
    }

    /**
     * Plays a round of the game
     */
    private void playRound() {

        GameHand p1Hand = player1.chooseHand();
        GameHand p2Hand = player2.chooseHand();

        System.out.println(player1.getName() + " has " + player1.getVictories()+ " victories, now chooses " + p1Hand);
        System.out.println(player2.getName() + " has " + player2.getVictories()+ " victories, now chooses " + p2Hand);


        // It's a tie, let' play another round
        if (p1Hand == p2Hand) {
            playRound();
            return;
        }

        rounds++;

        Player winner = player1;

        switch (p1Hand) {

            case PAPER:

                if (p2Hand == GameHand.SCISSORS) {
                    winner = player2;
                }
                break;

            case ROCK:
                if (p2Hand == GameHand.PAPER) {
                    winner = player2;
                }
                break;

            case SCISSORS:
                if (p2Hand == GameHand.ROCK) {
                    winner = player2;
                }
                break;
        }

        winner.win();

    }


    private void displayResults() {

        System.out.println("=== GAME END ===");
        System.out.println(player1.getName() + " has " + player1.getVictories() + " victories");
        System.out.println(player2.getName() + " has " + player2.getVictories() + " victories");

        System.out.println("WINNER IS : " + (player1.getVictories() > player2.getVictories() ? player1.getName() : player2.getName()));

    }

}
