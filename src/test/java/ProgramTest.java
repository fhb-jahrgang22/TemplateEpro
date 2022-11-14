import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lecture.Program;

public class ProgramTest {

    Program unitToTest = new Program();

    @Test
    public void testFooTrue() {
        boolean result = unitToTest.foo(true);
        Assertions.assertTrue(result);
    }

    @Test
    public void testFooFalse() {
        boolean result = unitToTest.foo(false);
        Assertions.assertFalse(result);
    }

}
