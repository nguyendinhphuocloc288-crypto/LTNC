public class Solution16 {
    public boolean isprime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n == 3) return true;
        for (int i = 4; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Solution16 solution16 = new Solution16();
        System.out.println(solution16.isprime(10));
    }
}
