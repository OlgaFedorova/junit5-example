package ofedorova.disable_enable_tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

/**
 * DisabledOnJreTest.
 *
 * @author Olga_Fedorova
 */
public class EnabledOnJreTest {

    @Test
    void testOnAllJre() {
        assertTrue(3 > 0);
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testEnabledOnJava8() {
        assertFalse(0 > 4);
    }

    @EnabledOnJre(JRE.JAVA_9)
    @Test
    void testEnabledOnJava9() {
        assertFalse(10 > 40);
    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testEnabledOnJava11() {
        assertFalse(10 > 40);
    }
}
