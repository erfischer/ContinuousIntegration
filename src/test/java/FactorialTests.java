import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FactorialTests{
    @Test
    public void testCalculateFactorial() {
        Factorial n = new Factorial();
        int i = n.calculateFactorial(4);
        int value = i;
        assertEquals(24, value);
    }
}
