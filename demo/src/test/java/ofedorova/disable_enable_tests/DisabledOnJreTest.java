package ofedorova.disable_enable_tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.JRE;

/**
 * DisabledOnJreTest.
 *
 * @author Olga_Fedorova
 */
public class DisabledOnJreTest {

    @Test
    void testOnAllJre() {
        assertTrue(3 > 0);
    }

    @DisabledOnJre(JRE.JAVA_8)
    @Test
    void testDisableOnJava8() {
        assertFalse(0 > 4);
    }

    @DisabledOnJre(JRE.JAVA_9)
    @Test
    void testDisableOnJava9() {
        assertFalse(10 > 40);
    }

    @DisabledOnJre(JRE.JAVA_11)
    @Test
    void testDisableOnJava11() {
        assertFalse(10 > 40);
    }
}
