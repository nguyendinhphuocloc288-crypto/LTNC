public class Solution19 {

    public int sumofDigits(int n){
        int sum = 0;
        while (n > 0){
            sum = sum + n%10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args){
        Solution19 solution19 = new Solution19();
        System.out.println(solution19.sumofDigits(1542));
    }
}
