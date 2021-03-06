package ofedorova.parameterized_tests;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * CsvSourceTest.
 *
 * @author Olga_Fedorova
 */
public class CsvSourceTest {

    @ParameterizedTest
    @CsvSource({ "one, 1", "two, 2", "'foo, bar', 3" })
    void testWithCsvSource(String first, int second) {
        assertNotNull(first);
        assertNotEquals(0, second);
    }
}
