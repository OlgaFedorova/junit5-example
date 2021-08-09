package ofedorova.parameterized_tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/**
 * MethodSourceTest.
 *
 * @author Olga_Fedorova
 */
public class MethodSourceTest {

    @ParameterizedTest
    @MethodSource("parameterProvider")
    void testWithSimpleMethodSource(String argument) {
        assertNotNull(argument);
    }

    // method name is the source to test
    static Stream<String> parameterProvider() {
        return Stream.of("parameter1", "parameter2");
    }
}
