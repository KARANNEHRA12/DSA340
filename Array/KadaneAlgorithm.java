//Q; https://leetcode.com/problems/maximum-subarray/description/
 public class KadaneAlgorithm {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if( max < sum ){
                max = sum;
            }
            if( sum < 0){
                sum =0;
            }
        }
         return  max;

        // inorder to print the Subarray we can use the following approach
//        If we carefully observe our algorithm, we can notice that the subarray always starts at the particular index where the sum variable is equal to 0, and at the ending index, the sum always crosses the previous maximum sum(i.e. max).
//        int start = 0;
//        int ansStart = -1, ansEnd = -1;
//        for (int i = 0; i < n; i++) {
//
//            if (sum == 0) start = i; // starting index
//
//            sum += arr[i];
//
//            if (sum > maxi) {
//                maxi = sum;
//
//                ansStart = start;
//                ansEnd = i;
//            }
//
//            // If sum < 0: discard the sum calculated
//            if (sum < 0) {
//                sum = 0;
//            }
//        }
//
//        //printing the subarray:
//        System.out.print("The subarray is: [");
//        for (int i = ansStart; i <= ansEnd; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.print("]\n");

    }
}
