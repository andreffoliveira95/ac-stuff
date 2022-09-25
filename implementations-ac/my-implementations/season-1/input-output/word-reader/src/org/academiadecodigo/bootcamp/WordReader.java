package org.academiadecodigo.bootcamp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class WordReader implements Iterable<String> {

    private String filePath;

    public WordReader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Iterator<String> iterator() {
        return new LineIterator();
    }


    private class LineIterator implements Iterator<String> {

        private BufferedReader bReader;
        private String line;

        public LineIterator() {
            try {
                bReader = new BufferedReader(new FileReader(filePath));
                line = bReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public boolean hasNext() {
            return line != null;
        }

        @Override
        public String next() {

            if(!hasNext()){
                throw new NoSuchElementException();
            }

            String current = line;
            try {
                line = bReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return current;

        }
    }
}
