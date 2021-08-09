package ofedorova.disable_enable_tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;

/**
 * DisabledIfEnvironmentVariableTest.
 *
 * @author Olga_Fedorova
 */
public class DisabledIfEnvironmentVariableTest {

    @Test
    void testOnAllEnvironmentVariables() {
        assertTrue(3 > 0);
    }

    @DisabledIfEnvironmentVariable(named="USER", matches="olga")
    @Test
    void testDisabledIfUserMatchesOlga() {
        assertFalse(0 > 4);
    }

    @DisabledIfEnvironmentVariable(named="HOME", matches="/home/olga")
    @Test
    void testDisabledIfHomeMatchesDirectory() {
        assertFalse(10 > 40);
    }
}
