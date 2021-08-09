package ofedorova.assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

import ofedorova.AssertThrowsDemo;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * AssertThrowsDemo.
 *
 * @author Olga_Fedorova
 */
public class AssertThrowsDemoTest {

    @Test
    public void testAssertThrows() {
        assertThrows(ArithmeticException.class, () -> new AssertThrowsDemo().divide(1, 0));
    }

    @Test
    public void testAssertThrowsWithMessage() {
        assertThrows(IOException.class, () -> new AssertThrowsDemo().divide(1, 0), "Division by zero !!!");
    }

    @Test
    public void testAssertThrowsWithMessageSupplier() {
        assertThrows(IOException.class, () -> new AssertThrowsDemo().divide(1, 0), () -> "Division by zero !!!");
    }

}
