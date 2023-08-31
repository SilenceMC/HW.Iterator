import java.util.Iterator;
import java.util.Random;

public class MyIterator implements Iterator<Integer> {
    protected Random random;
    private int min;
    private int max;

    public MyIterator(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return min + random.nextInt(max + 1 - min);
    }
}