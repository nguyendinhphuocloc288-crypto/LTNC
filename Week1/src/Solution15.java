public class Solution15 {
    public int gcd(int a, int b){
        if (a%b == 0) return b;
        if (b%a == 0) return a;
        while (a != b){
            if (a < b){
                b = b - a;
            } else {
                a = a - b;
            }
        }
        return a;
    }
    public static void main(String[] args){
        Solution15 solution15 = new Solution15();
        System.out.println(solution15.gcd(48,9));
    }
}
