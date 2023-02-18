package org.academiadecodigo.bootcamp.join;

public class TrabalhadorDasCaldas implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("TRABALHADOR DAS CALDAS: Estou aqui a fazer umas loiças");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        System.out.println("TRABALHADOR DAS CALDAS: Não faço nem mais um caralho.");

    }

}
