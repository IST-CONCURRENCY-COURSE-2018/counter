package counter;


import com.devexperts.dxlab.lincheck.LinChecker;
import com.devexperts.dxlab.lincheck.annotations.Operation;
import com.devexperts.dxlab.lincheck.strategy.stress.StressCTest;
import org.junit.Test;


@StressCTest
public class LinearizabilityTest {
    private Counter c = new CounterImpl();

    @Operation
    public int inc() {
        return c.getAndAdd(1);
    }

    @Operation
    public int get() {
        return c.get();
    }

    @Test
    public void test() {
        LinChecker.check(LinearizabilityTest.class);
    }
}