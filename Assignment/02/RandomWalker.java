
public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;

        int step = 0;
        System.out.println("(" + x + "," + y + ")");
        while (Math.abs(x) + Math.abs(y) != r) {
            double prob = Math.random();
            if (prob < 0.25) x += 1;
            else if (prob < 0.5) x -= 1;
            else if (prob < 0.75) y += 1;
            else if (prob < 1.0) y -= 1;
            step += 1;
            System.out.println("(" + x + "," + y + ")");
        }
        System.out.println("steps = " + step);
    }
}
