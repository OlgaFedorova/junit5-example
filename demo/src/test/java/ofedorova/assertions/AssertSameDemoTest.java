package ofedorova.assertions;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

/**
 * AssertSameDemoTest.
 *
 * @author Olga_Fedorova
 */
public class AssertSameDemoTest {

    @Test
    public void testAssertSameWithSameObject() {
        String actual = "hello";
        String expected = "hello";
        assertSame(expected, actual);
    }

    @Test
    public void testAssertSameWithDifferentObject() {
        String actual = "hello";
        String expected = new String("hello");
        assertSame(expected, actual);
    }

    @Test
    public void testAssertSameWithDifferentObjectAndMessage() {
        String actual = "hello";
        String expected = new String("hello");
        assertSame(expected, actual, "The actual value is not same as expected value");
    }

    @Test
    public void testAssertSameWithDifferentObjectAndMessageSupplier() {
        String actual = "hello";
        String expected = new String("hello");
        assertSame(expected, actual, () -> "The actual value is not same as expected value");
    }
}
