//Q: https://leetcode.com/problems/subarray-sum-equals-k/
import java.util.HashMap;

public class CountSubArrayWithGivenSum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm =  new HashMap<>();
        int count =0;
        hm.put(0,1);
        int prefixSum=0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            count += hm.getOrDefault(prefixSum-k,0);

            hm.put(prefixSum, hm.getOrDefault(prefixSum,0) +1 );


        }
         return count;


    }
}
