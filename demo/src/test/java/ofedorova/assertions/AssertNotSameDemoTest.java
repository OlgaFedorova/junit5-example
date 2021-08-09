package ofedorova.assertions;

import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.Test;

/**
 * AssertNotSameDemoTest.
 *
 * @author Olga_Fedorova
 */
public class AssertNotSameDemoTest {

    @Test
    public void testAssertNotSameWithDifferentObject() {
        String actual = "hello";
        String expected = new String("hello");
        assertNotSame(expected, actual);
    }

    @Test
    public void testAssertNotSameWithSameObject() {
        String actual = "hello";
        String expected = "hello";
        assertNotSame(expected, actual);
    }

    @Test
    public void testAssertNotSameWithSameObjectAndMessage() {
        String actual = "hello";
        String expected = "hello";
        assertNotSame(expected, actual, "The actual value is same as expected value");
    }

    @Test
    public void testAssertNotSameWithSameObjectAndMessageSupplier() {
        String actual = "hello";
        String expected = "hello";
        assertNotSame(expected, actual, () -> "The actual value is same as expected value");
    }
}
