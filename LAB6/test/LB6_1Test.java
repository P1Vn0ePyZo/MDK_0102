import Lab6.LB6_1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LB6_1Test {
    @Test
    void testCreateMatrix() {
        int[][] expected = {
                {20, 20, 20},
                {40, 40, 40},
                {60, 60, 60}
        };
        assertArrayEquals(expected, LB6_1.createMatrix(3, 3));
    }
}