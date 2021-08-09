package ofedorova.parameterized_tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/**
 * EnumSourceTest.
 *
 * @author Olga_Fedorova
 */
public class EnumSourceTest {

    @ParameterizedTest
    @EnumSource(Animal.class)
    void testEnumSource(Animal animal) {
        assertNotNull(animal);
    }
}
