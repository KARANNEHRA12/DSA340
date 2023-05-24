//Q:https://leetcode.com/problems/next-permutation/description/
import java.util.*;

public class Nextpermutation {
    public List<Integer> nextPermutation(Integer[] nums) {
         int indx =-1;
        List<Integer> ans = Arrays.asList(nums);
           int n= nums.length;
        for (int i = n-2 ; i>=0 ; i--) {
            if( ans.get(i) < ans.get(i+1)){
                indx = i;
                 break;
            }

        }
         if( indx == -1){
             Collections.reverse(ans);
             return ans;
         }
         for (int i = n-1 ; i >=0; i--){
             if( nums[i] > nums[indx]){
                  int temp = nums[i];
                  nums[i] = nums[indx];
                  nums[indx ]= temp;
                   break;

             }
         }
          List<Integer> subList = ans.subList(indx +1 , n);
         Collections.reverse(subList);
         return ans;

    }
    public void nextPermutation(int[] nums) {
        int indx =-1;
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for( int a : nums){
            ans.add(a);
        }
        for (int i = n -2 ; i >=0; i--) {

            if( ans.get(i) < ans.get(i+1)){
                indx = i;
                break;
            }
        }
         if( indx == -1){
             Collections.reverse(ans);
               ans.toArray();
         }


    }
}
