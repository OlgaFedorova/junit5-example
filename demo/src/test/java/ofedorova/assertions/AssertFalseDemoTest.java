package ofedorova.assertions;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

/**
 * AssertFalseDemoTest.
 *
 * @author Olga_Fedorova
 */
public class AssertFalseDemoTest {

    @Test
    public void testAssertFalseWithFalseCondition() {
        boolean falseValue = false;
        assertFalse(falseValue);
    }

    @Test
    public void testAssertFalseWithTrueCondition() {
        boolean trueValue = true;
        assertFalse(trueValue);
    }

    @Test
    public void testAssertFalseWithTrueConditionAndMessage() {
        boolean trueValue = true;
        assertFalse(trueValue, "The actual value is true");
    }

    @Test
    public void testAssertFalseWithTrueConditionAndMessageSupplier() {
        boolean trueValue = true;
        assertFalse(trueValue, () -> "The actual value is true");
    }

    @Test
    public void testAssertFalseWithBooleanSupplier() {
        boolean falseValue = false;
        assertFalse(() -> falseValue);
    }

    @Test
    public void testAssertFalseWithBooleanSupplierAndMessage() {
        boolean trueValue = true;
        assertFalse(() -> trueValue, "The actual value is true");
    }

    @Test
    public void testAssertFalseWithBooleanSupplierAndMessageSupplier() {
        boolean trueValue = true;
        assertFalse(() -> trueValue, () -> "The actual value is true");
    }
}
