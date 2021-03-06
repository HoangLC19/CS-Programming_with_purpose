public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] sum = new int[args.length];
        sum[0] = 0;
        for(int i = 1; i < sum.length; i++) {
            int s = 0;
            for(int j = 1; j <= i; j++) {
                s = s + Integer.parseInt(args[j]);
            }
            sum[i] = s;
        }
        int i = 0;
        while (i < m) {
            int rand = (int)(Math.random()*sum[sum.length - 1]);
            for (int j = 0; j <= sum.length - 1; j++) {
                if (rand >= sum[j] && rand < sum[j + 1]) {
                    System.out.print(j + 1 + " ");
                    i++;
                    break;
                }
            }
            if (i%25==0) System.out.println();
        }
    }
}
