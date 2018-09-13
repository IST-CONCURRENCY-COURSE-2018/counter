package counter;

/**
 * Counter interface.
 */
public interface Counter {

    /**
     * Atomically adds the given value to the current value,
     * and returns the previous value.
     */
    int getAndAdd(int delta);

    /**
     * Returns the current value.
     */
    int get();
}
