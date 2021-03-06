public class Factors {
    public static void main(String[] args) {
        // long num = Integer.parseInt(args[0]);

        // for (int i = 2; i < num/i; i++) {
        //     while(num%i == 0) {
        //         System.out.print(i + " * ");
        //         num = num/i;
        //     }
        // }
        // if (num > 1) System.out.print(num);
        // System.out.println();
        int i, j;
        for (i = 0, j = 0; i < 10; i++)
            j += i;
        System.out.println(j);
    }
}
