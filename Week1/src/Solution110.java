public class Solution110 {

    public int secondLargest(int[] arr){
        if (arr.length < 2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int Slargest = Integer.MIN_VALUE;

        for (int num:arr){
            if (num > largest){
                Slargest = largest;
                largest = num;
            } else if (num > Slargest && num != largest){
                Slargest = num;
            }
        }

        if (Slargest == Integer.MIN_VALUE){
            return -1;
        }
        return Slargest;
    }

    public static void main(String[] args){
        Solution110 solution = new Solution110();
        int[] arr1 = {1, 5, 2, 4, 3};
        int[] arr2 = {5, 5, 5, 5};
        int[] arr3 = {10, 10, 8, 5};

        System.out.println(solution.secondLargest(arr1));
        System.out.println(solution.secondLargest(arr2));
        System.out.println(solution.secondLargest(arr3));
    }
}
