public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int minesNum = Integer.parseInt(args[2]);
        int totalMines = minesNum;

        boolean[][] hasMine = new boolean[m + 2][n + 2];
        int[][] neighboringMines = new int[m + 2][n + 2];

        // Place the mines 3.
        while (totalMines > 0) {
            int rx = 1 + (int) (Math.random() * m);
            int ry = 1 + (int) (Math.random() * n);
            if (!hasMine[rx][ry]) {
                hasMine[rx][ry] = true;
                totalMines--;
            }
        }

        // Calculate the neiboring mines.
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (!hasMine[i][j]) {
                    int mines = 0;
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int p = j - 1; p <= j + 1; p++) {
                            if (hasMine[k][p]) {
                                mines++;
                            }
                        }
                    }
                    neighboringMines[i][j] = mines;
                }
                else {
                    neighboringMines[i][j] = -1;
                }
            }
        }

        // Print the Minesweeper.
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (neighboringMines[i][j] < 0) {
                    System.out.print((j == 1 ? "" : " ") + "*" + (j == n ? "" : " "));
                }
                else {
                    System.out.print((j == 1 ? "" : " ") + neighboringMines[i][j] + (j == n ? "" :
                                                                                     " "));
                }
            }
            System.out.println();
        }
    }
}
