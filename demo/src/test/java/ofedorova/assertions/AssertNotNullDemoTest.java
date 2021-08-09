package ofedorova.assertions;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import ofedorova.StringUtils;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

/**
 * AssertNotNullDemoTest.
 *
 * @author Olga_Fedorova
 */
class AssertNotNullDemoTest {

    @Test
    void givenNullString_whenReverseIsCalled_thenNullIsReturned() {
        String actual = StringUtils.reverse((null));
        String message = "Actual String should not be null !!! ";

        // assertNotNull with message
        assertNotNull(actual, message);
    }

    @Test
    void givenNullString_whenReverseIsCalled_thenNullIsReturned2() {
        String actual = StringUtils.reverse((null));
        Supplier<String> messageSupplier = () -> "Actual String should not be null !!! ";

        // assertNotNull with Java 8 MessageSupplier
        assertNotNull(actual, messageSupplier);
    }

    @Test
    void givenEmptyString_whenReverseIsCalled_thenEmptyStringIsReturned() {
        String actual = StringUtils.reverse((""));

        // assertNotNull without message
        assertNotNull(actual);
    }

    @Test
    void givenNonNullString_whenReverseIsCalled_thenReversedStringIsReturned() {
        String actual = StringUtils.reverse(("ABCD"));

        // assertNotNull without message
        assertNotNull(actual);
    }

}