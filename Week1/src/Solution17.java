public class Solution17 {
    public int reverse(int n){
        int n2 = 0;
        while (n != 0){
            n2 = n2*10 + n%10;
            n /= 10;
        }
        return n2;
    }
    public static void main(String[] args){
        Solution17 solution17 = new Solution17();
        System.out.println(solution17.reverse(243));
        System.out.println(solution17.reverse(0));
        System.out.println(solution17.reverse(-243));
    }
}
