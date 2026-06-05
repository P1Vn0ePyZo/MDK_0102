package Lab6;

public class LB6_1 {
    public static int[][] createMatrix(int N, int M) {
        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = 20 * (i + 1);
            }
        }
        return A;
    }
}