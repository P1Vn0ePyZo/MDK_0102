import Lab6.LB6_3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LB6_3Test {
    @Test
    void testCreateMatrix() {
        int[][] expected = {
                {1, 0, -7, -26},
                {2, 1, -6, -25},
                {9, 8, 1, -18},
                {28, 27, 20, 1}
        };
        assertArrayEquals(expected, LB6_3.createMatrix(4, 4));
    }
}