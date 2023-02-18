import java.util.Iterator;

/**
 * Created by ferrao on 30/05/16.
 */
public class RangeTest {

    public static void main(String[] args) {

        System.out.println("--- USING ENHANCED FOR WITH FORWARD ITERATOR ---");
        Range r = new Range(3, 9);
        r.setReversed(false);

        for (Integer i : r) {
            System.out.println(i);
        }

        System.out.println("--- USING REVERSE ITERATOR ---");
        r.setReversed(true);

        for (Integer i : r) {
            System.out.println(i);
        }

    }

}
