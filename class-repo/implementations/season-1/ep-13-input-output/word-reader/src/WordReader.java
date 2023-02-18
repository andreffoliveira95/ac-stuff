import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Word Reader reads a text file using a buffered (character) reader
 */
public class WordReader implements Iterable<String> {

    private final String filename;

    /**
     * Single argument constructor
     *
     * @param filename the name of the file to to read
     */
    public WordReader(String filename) {
        this.filename = filename;
    }

    /**
     * @see Iterator
     */
    @Override
    public Iterator<String> iterator() {
        return new WordReaderIterator();
    }

    private class WordReaderIterator implements Iterator<String> {

        private BufferedReader inputBufferedReader;
        private String currentLine;

        public WordReaderIterator() {

            try {

                inputBufferedReader = new BufferedReader(new FileReader(filename));
                currentLine = readLineOfText();

            } catch (FileNotFoundException e) {

                throw new IllegalArgumentException(e);

            }

        }

        private String readLineOfText() {

            String line = null;

            try {

                line = inputBufferedReader.readLine();

                // end of file
                if (line == null) {
                    inputBufferedReader.close();
                    return null;
                }

                // line contains no words or only contains non-word characters, fetch a new one
                if (line.equals("") || line.matches("\\W+")) {
                    return readLineOfText();
                }
            } catch (IOException e) {
                currentLine = null;
            }

            return line;

        }

        /**
         * @see Iterator#hasNext()
         */
        @Override
        public boolean hasNext() {

            return currentLine != null;

        }

        /**
         * @see Iterator#next()
         */
        @Override
        public String next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            String nextLine = currentLine;

            currentLine = readLineOfText();

            return nextLine;

        }

    }

}
