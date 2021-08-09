package ofedorova.disable_enable_tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

/**
 * DisabledOnOsTest.
 *
 * @author Olga_Fedorova
 */
public class EnabledOnOsTest {

    @Test
    void testOnAllOs() {
        assertTrue(3 > 0);
    }

    @EnabledOnOs(OS.MAC)
    @Test
    void testEnabledOnMacOs() {
        assertFalse(0 > 4);
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testEnabledOnWindowOs() {
        assertFalse(10 > 40);
    }

    @EnabledOnOs(OS.LINUX)
    @Test
    void testEnabledOnLinuxOs() {
        assertFalse(10 > 40);
    }
}
