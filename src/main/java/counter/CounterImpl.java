package counter;

public class CounterImpl implements Counter {
    private int value = 0;

    @Override
    public int getAndAdd(int delta) {
        int cur = value;
        value += delta;
        return cur;
    }

    @Override
    public int get() {
        return value;
    }
}
