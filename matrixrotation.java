public class matrixrotation {
    static void rotate90(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
              
            }
        }
        for (int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        rotate90(mat);
        for (int[] row : mat) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
}}

