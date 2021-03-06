public class CouponCollect {
    public static void main(String[] args) {
        // int M = Integer.parseInt(args[0]);
        // int M = 13;
        // Boolean[] coupon = new Boolean[M];
        // for (int i = 0; i < coupon.length; i++) {
        //     coupon[i] = false;
        // }
        // int allTrue = 0;
        // int Step = 0;
        // while(allTrue < coupon.length) {
        //     int rand = (int)(Math.random()*(M));
        //     if (coupon[rand] != true) {
        //         coupon[rand] = true;
        //         allTrue += 1; 
        //     }
        //     Step++;
        // }
        // System.out.println("Steps = " + Step);
        int[] a = new int[10];
    
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
       
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
    
        System.out.println(a[5]);
    }
}