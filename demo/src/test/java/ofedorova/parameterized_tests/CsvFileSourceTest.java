package ofedorova.parameterized_tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * CsvFileSourceTest.
 *
 * @author Olga_Fedorova
 */
public class CsvFileSourceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/capitals.csv", numLinesToSkip = 1)
    void testWithCsvFileSource(String country, String capital) {
        assertNotNull(country);
        assertNotNull(capital);
    }
}
