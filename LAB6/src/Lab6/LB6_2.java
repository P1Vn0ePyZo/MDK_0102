package Lab6;

public class LB6_2 {
    public static int[][] createMatrix(int N, int M) {
        int[][] H = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                H[i][j] = (i * j) % 8;
            }
        }
        return H;
    }
}