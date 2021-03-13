public class RevesPuzzle {

    private static void hanoi(int n, int k, String start, String temp, String to) {
        if (n == 0) return;
        hanoi(n - 1, k, start, to, temp);
        System.out.println("Move disc " + (n+k) + " from " + start + " to " + to);
        hanoi(n - 1, k, temp, start, to);
    }

    private static void reves(int n, String start, String temp1, String temp2, String to) {
        int k = (int)Math.round(n + 1 - Math.sqrt(2*n + 1));
        if (k == 0) {
            System.out.println("Move disc " + 1 + " from " + start + " to " + to);
            return;
        }
        reves(k, start, to, temp2, temp1);
        hanoi(n - k, k, start, temp2, to);
        reves(k, temp1, start, temp2, to);
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        reves(n, "A", "B", "C", "D");
    }
}
