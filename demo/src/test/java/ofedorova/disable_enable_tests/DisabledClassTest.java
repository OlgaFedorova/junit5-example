package ofedorova.disable_enable_tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * DisabledClassTest.
 *
 * @author Olga_Fedorova
 */
@Disabled
public class DisabledClassTest {

    @Test
    void testMethod1() {
        assertTrue(4 > 0);
    }

    @Test
    void testMethod2() {
        assertFalse(4 < 0);
    }
}
