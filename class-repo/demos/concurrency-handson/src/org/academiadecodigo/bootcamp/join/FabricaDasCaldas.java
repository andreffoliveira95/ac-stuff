package org.academiadecodigo.bootcamp.join;

public class FabricaDasCaldas {

    public static void main(String[] args) {

        Thread trabalhador = new Thread(new TrabalhadorDasCaldas());
        trabalhador.start();

        try {

            System.out.println("GERENTE: À espera que os trabalhadores acabem.");
            trabalhador.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("GERENTE: Finalmente acabaram! Vou para casa.");




    }

}
