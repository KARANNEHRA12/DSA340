//Q: https://leetcode.com/problems/two-sum/
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // using hashMap approach
//    public int[] twoSum(int[] nums, int target) {
//        int [] ans = new int[2];
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int currSum = target- nums[i];
//            if( hm.containsKey(currSum)){
//                ans[0]= hm.get(currSum);
//                ans[1]= i;
//            }
//            hm.put(nums[i],i);
//
//        }
//         return ans;
//
//    }

    // using Two pointer approach
     // note : in this approach we are sorting the array this means that we do not get original index of element as they were in original arary before sorting therfore we need to find a way to store index also therefore the hashing is more suitable for this
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        Arrays.sort(nums);
         int left =0, n = nums.length;
         int right = n-1;
        while( left < right){
            int currsum = nums[left] + nums[right];
            if( currsum == target){
                ans[0] = left;
                ans[1] = right;
            }
            else if( currsum < target){
                left++;
            }
            else {
                right--;
            }
        }
         return ans;

    }

}
