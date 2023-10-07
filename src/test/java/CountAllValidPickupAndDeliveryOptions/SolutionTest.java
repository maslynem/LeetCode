package CountAllValidPickupAndDeliveryOptions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource(value = {
            "1, 1",
            "2, 6",
            "3, 90"
    })
    void test(int n, int expected) {
        assertEquals(expected, solution.countOrders(n));
    }

}