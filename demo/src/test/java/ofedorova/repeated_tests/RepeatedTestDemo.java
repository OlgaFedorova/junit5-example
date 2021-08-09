package ofedorova.repeated_tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

/**
 * RepeatedTestDemo.
 *
 * @author Olga_Fedorova
 */
public class RepeatedTestDemo {

    @RepeatedTest(5)
    public void simpleRepeatedTest() {
        assertTrue(0 < 5);
    }
}
