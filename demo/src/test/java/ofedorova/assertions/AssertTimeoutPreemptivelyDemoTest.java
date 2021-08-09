package ofedorova.assertions;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import org.junit.jupiter.api.Test;

import java.time.Duration;

/**
 * AssertTimeoutPreemptivelyDemoTest.
 *
 * Assertions API provide static assertTimeoutPreemptively() method. It is used to test long-running tasks. If given task inside the test case takes more than the specified
 * duration, then the test will fail.
 *
 * The executable provided to the test case will be executed in the different thread as that of the calling code. Also, the execution of the executable will be preemptively
 * aborted if the timeout is exceeded.
 *
 * @author Olga_Fedorova
 */
public class AssertTimeoutPreemptivelyDemoTest {

    @Test
    void timeoutExceededWithPreemptiveTermination() {
        // The following assertion fails with an error message similar to:
        // execution timed out after 10 ms
        assertTimeoutPreemptively(Duration.ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            Thread.sleep(100);
        });
    }
}
