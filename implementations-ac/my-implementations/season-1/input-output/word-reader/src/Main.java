import java.util.Iterator;

/**
 * Entry point class to the WordReader exercise
 */
public class Main {

    private static final String FILE_PATH = "resources/lorem_ipsum.txt";

    /**
     * Entry point
     * @param args application entry point arguments
     */
    public static void main(String[] args) {

        WordReader wordReader = new WordReader(FILE_PATH);

//        for (String word: wordReader) {
//            System.out.println(word);
//        }

        Iterator<String> it = wordReader.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
