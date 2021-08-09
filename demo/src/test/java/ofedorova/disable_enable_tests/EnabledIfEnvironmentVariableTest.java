package ofedorova.disable_enable_tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

/**
 * DisabledIfEnvironmentVariableTest.
 *
 * @author Olga_Fedorova
 */
public class EnabledIfEnvironmentVariableTest {

    @Test
    void testOnAllEnvironmentVariables() {
        assertTrue(3 > 0);
    }

    @EnabledIfEnvironmentVariable(named="USER", matches="olga")
    @Test
    void testEnabledIfUserMatchesOlga() {
        assertFalse(0 > 4);
    }

    @EnabledIfEnvironmentVariable(named="HOME", matches="/home/olga")
    @Test
    void testEnabledIfHomeMatchesDirectory() {
        assertFalse(10 > 40);
    }
}
