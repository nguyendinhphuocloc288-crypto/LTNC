public class Solution18 {

    public int reverse(int n) {
        int n2 = 0;
        while (n != 0) {
            n2 = n2 * 10 + n % 10;
            n /= 10;
        }
        return n2;
    }

    public boolean isPalindrome(int n){
        if (n == reverse(n)){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args){
        Solution18 solution18 = new Solution18();
        System.out.println(solution18.isPalindrome(1234321));
    }

}