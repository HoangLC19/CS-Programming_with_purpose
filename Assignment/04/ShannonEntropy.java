public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] a = new int[m];
        int count = 0;
        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            if (x <= m) a[x - 1] += 1;
            count++;
        }
        double h = 0.0;
        for (int i = 0; i < m; i++) {
            if (a[i] != 0) {
                double p = (double) a[i] / count;
                h -= p * (Math.log(p) / Math.log(2.0));
            }

        }

        StdOut.printf("%.4f\n", h);


    }
}
