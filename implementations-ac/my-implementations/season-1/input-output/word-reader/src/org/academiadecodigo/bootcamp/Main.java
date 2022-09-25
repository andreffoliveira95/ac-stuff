package org.academiadecodigo.bootcamp;

public class Main {


    public static void main(String[] args) {

        WordReader wordReader = new WordReader("resources/poem.txt");

        for(String sentence : wordReader){
            System.out.println(sentence);
        }

    }
}
