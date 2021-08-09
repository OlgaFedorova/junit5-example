package ofedorova;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * ofedorova.CalculatorTest.
 *
 * @author Olga_Fedorova
 */
class CalculatorTest {

    @Test
    public void givenTwoNumbers3And4_whenAdditionIsCalled_then7IsReturned() {
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.addition(3, 4));
    }

}