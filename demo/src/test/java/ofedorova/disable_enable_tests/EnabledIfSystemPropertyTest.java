package ofedorova.disable_enable_tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

/**
 * DisabledIfSystemPropertyTest.
 *
 * @author Olga_Fedorova
 */
public class EnabledIfSystemPropertyTest {

    @Test
    void testOnAllSystemProperties() {
        assertTrue(3 > 0);
    }

    @EnabledIfSystemProperty(named="user.name", matches="olga")
    @Test
    void testEnabledIfUserNameMatchesOlga() {
        assertFalse(0 > 4);
    }

    @EnabledIfSystemProperty(named="os.name", matches="Linux")
    @Test
    void testEnabledIfOperatingSystemMatchesLinux() {
        assertFalse(10 > 40);
    }
}
