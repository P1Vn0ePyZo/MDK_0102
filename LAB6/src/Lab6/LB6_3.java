package Lab6;

public class LB6_3 {
    public static int[][] createMatrix(int N, int M) {
        int[][] G = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                G[i][j] = (i * i * i - j * j * j) + 1;
            }
        }
        return G;
    }
}
