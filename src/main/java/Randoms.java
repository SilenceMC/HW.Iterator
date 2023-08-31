import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private MyIterator myIterator;
    protected Random random;

    public Randoms(int min, int max) {
        if (max <= min) {
            throw new IllegalArgumentException("max должен превышать min");
        }
        myIterator = new MyIterator(min, max);
    }

    @Override
    public Iterator<Integer> iterator() {
        return myIterator;
    }
}