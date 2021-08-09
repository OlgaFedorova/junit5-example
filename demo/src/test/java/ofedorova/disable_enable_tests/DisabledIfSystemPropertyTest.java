package ofedorova.disable_enable_tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;

/**
 * DisabledIfSystemPropertyTest.
 *
 * @author Olga_Fedorova
 */
public class DisabledIfSystemPropertyTest {

    @Test
    void testOnAllSystemProperties() {
        assertTrue(3 > 0);
    }

    @DisabledIfSystemProperty(named="user.name", matches="olga")
    @Test
    void testDisabledIfUserNameMatchesOlga() {
        assertFalse(0 > 4);
    }

    @DisabledIfSystemProperty(named="os.name", matches="Linux")
    @Test
    void testDisabledIfOperatingSystemMatchesLinux() {
        assertFalse(10 > 40);
    }
}
