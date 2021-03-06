public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double sumStep = 0;
        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;
            int step = 0;
            while (Math.abs(x) + Math.abs(y) != r || step > 1E6) {
                double prob = Math.random();
                if (prob < 0.25) x += 1;
                else if (prob < 0.5) x -= 1;
                else if (prob < 0.75) y += 1;
                else if (prob < 1.0) y -= 1;
                step += 1; 
            }
            sumStep += step;
        }
        System.out.println("average number of steps = " + sumStep/trials);
    }
}
