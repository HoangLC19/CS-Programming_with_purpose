public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double sum = 0;
        for(int i = 0; i < n; i++){
            double power = Math.pow(i+1, r);
            sum += 1/power;
        }
        System.out.println(sum);
    }
}
