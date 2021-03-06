public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0, n);
        boolean blue = true;
        for (double x = 0; x < n; x++) {
            for (double y = 0; y < n; y++) {
                if (blue) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    blue = false;
                } else {
                    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                    blue = true;
                }
                StdDraw.filledSquare(x + 0.5, y + 0.5, 0.5);
                if (y == n - 1 && n % 2 == 0) blue = !blue;
            }
        }


    }
}
