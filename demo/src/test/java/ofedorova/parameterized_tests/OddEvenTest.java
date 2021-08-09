package ofedorova.parameterized_tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import ofedorova.OddEven;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * OddEvenTest.
 *
 * @author Olga_Fedorova
 */
public class OddEvenTest {

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,Integer.MAX_VALUE})
    void givenANumber_whenIsEvenIsCalled_thenTrueIsReturnedForEvenNumbers(int number) {
        OddEven oddEven = new OddEven();
        assertTrue(oddEven.isNumberEven(number));
    }
}
