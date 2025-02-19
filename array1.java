public class array1 {
    public static void main(String[] args) {
        int[] a= {5, 7, 2, 11};
        int N = 9;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == N) {
                    System.out.println(i + "," + j);
                    return;
                }
            }
        }
    }
}
