package ofedorova.repeated_tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

/**
 * RepeatedTestWithDisplayNameDemo.
 *
 * @author Olga_Fedorova
 */
public class RepeatedTestWithDisplayNameDemo {

    @RepeatedTest(name="{displayName} - {currentRepetition}/{totalRepetitions}",
            value = 5)
    @DisplayName("Repeated test")
    public void repeatedTestWithDisplayName() {
        assertTrue(0 < 5);
    }
}
