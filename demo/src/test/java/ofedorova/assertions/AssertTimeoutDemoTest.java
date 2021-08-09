package ofedorova.assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import org.junit.jupiter.api.Test;

import java.time.Duration;

/**
 * AssertTimeoutDemoTest.
 *
 * Assertions API provide static assertTimeout() method. It is used to test long-running tasks. If given task inside the test case takes more than the specified duration,
 * then the test will fail.
 *
 * The executable provided to the test case will be executed in the same thread as that of the calling code. Also, the execution of the executable will not be preemptively
 * aborted if the timeout is exceeded.
 *
 * @author Olga_Fedorova
 */
public class AssertTimeoutDemoTest {

    @Test
    void timeoutNotExceeded() {
        // The following assertion succeeds.
        assertTimeout(Duration.ofMinutes(3), () -> {
            // Perform task that takes less than 3 minutes.
        });
    }

    @Test
    void timeoutNotExceededWithResult() {
        // The following assertion succeeds, and returns the supplied object.
        String actualResult = assertTimeout(Duration.ofMinutes(3), () -> {
            return "result";
        });
        assertEquals("result", actualResult);
    }

    @Test
    void timeoutNotExceededWithMethod() {
        // The following assertion invokes a method reference and returns an object.
        String actualGreeting = assertTimeout(Duration.ofMinutes(3), AssertTimeoutDemoTest::greeting);
        assertEquals("Hello, World!", actualGreeting);
    }

    @Test
    void timeoutExceeded() {
        // The following assertion fails with an error message similar to:
        // execution exceeded timeout of 10 ms by 91 ms
        assertTimeout(Duration.ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            Thread.sleep(100);
        });
    }

    private static String greeting() {
        return "Hello, World!";
    }
}
