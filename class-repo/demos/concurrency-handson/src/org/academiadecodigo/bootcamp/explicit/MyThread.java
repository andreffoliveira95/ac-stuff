package org.academiadecodigo.bootcamp.explicit;

public class MyThread implements Runnable {

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());

    }

}
