import Lab6.LB6_2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LB6_2Test {
    @Test
    void testCreateMatrix() {
        int[][] expected = {
                {0, 0, 0, 0},
                {0, 1, 2, 3},
                {0, 2, 4, 6},
                {0, 3, 6, 1}
        };
        assertArrayEquals(expected, LB6_2.createMatrix(4, 4));
    }
}