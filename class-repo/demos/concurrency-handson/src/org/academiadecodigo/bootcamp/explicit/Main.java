package org.academiadecodigo.bootcamp.explicit;

public class Main {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {

            Thread thread = new Thread(new MyThread());
            thread.setName("Thread " + i);
            thread.start();

        }

        System.out.println("AND DONE!");

    }

}
