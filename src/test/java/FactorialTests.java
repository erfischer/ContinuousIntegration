import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTests{
    @Test
    public void testCalculateFactorial() {
        Factorial n = new Factorial();
        int i = n.calculateFactorial(4);
        assertEquals(24, i);
    }

    @Test
    public void failingTest() {
        Factorial n = new Factorial();
        int i = n.calculateFactorial(3);
        assertEquals(24, i);
    }


}
