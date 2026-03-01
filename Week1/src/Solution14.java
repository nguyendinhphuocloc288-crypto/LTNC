public class Solution14 {
    public long fibonacci(long n){
        if (n < 0){
            return -1;
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        long f0 = 0;
        long f1 = 1;
        long fn = n;

        for (int i = 2; i <=n; i++){
            if (f1 > Long.MAX_VALUE - f0) {
                return Long.MAX_VALUE;
            }
        fn = f0 + f1;
        f0 = f1;
        f1 = fn;
        }
    return fn;
    }
    public static void main(String[] args){
        Solution14 sol = new Solution14();
        System.out.println("n = -1 -> " + sol.fibonacci(-1));
        System.out.println("n = 0  -> " + sol.fibonacci(0));
        System.out.println("n = 1  -> " + sol.fibonacci(1));
        System.out.println("n = 10 -> " + sol.fibonacci(10));
        System.out.println("n = 92 -> " + sol.fibonacci(92));
        System.out.println("n = 93 -> " + sol.fibonacci(93));
        System.out.println("n = 100 -> " + sol.fibonacci(100));
    }
}
