//Q: https://leetcode.com/problems/majority-element-ii/description/
 import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElemNByThree {
    public List<Integer> majorityElement(int[] nums) {

        // -----------------using hashMap------------------------
//         int n = nums.length;
//         List<Integer> list = new ArrayList<>();
//        HashMap<Integer, Integer> ans = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//           int val =  ans.getOrDefault(nums[i], 0);
//            ans.put(nums[i], val + 1);
//
//        }
//        for (Map.Entry<Integer,Integer> mp : ans.entrySet()  ) {
//            if( mp.getValue() > ( n/3)){
//                list.add(mp.getKey());
//
//            }
//
//        }
//         return list;

        // ------------------using modified moore voting algorithms ----------------
//        .. as we know there can  be atMax  two majority elements

        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int elem1 =0;
        int count1 =0;
        int elem2 =0;
        int count2 = 0;

        for( int i =0 ;i< n ; i++){
            // this check is to ensure that both elem1 and elem2 are different
            if( count1 == 0 && nums[i] != elem2){
                count1 = 1;
                elem1 = nums[i];
            }
            else if( count2 == 0 && nums[i] != elem1){
                count2 = 1;
                elem2 = nums[i];
            }
            else if( elem1 == nums[i]){
                count1++;
            }
            else if( elem2 == nums[i]){
                count2++;
            }
            else {
                count1--;
                count2--;
            }

        }
        // for checking is the elem 1 & 2 ar majority or not
    count1=0;
      count2 =0;
        for (int i = 0; i < n; i++) {
            if( elem1 == nums[i]){
                count1++;
            }
            else if( elem2 == nums[i]){
                count2++;
            }

        }
        int maj = (n / 3) +1;
        if(count1 >= maj) list.add(elem1);
        if( count2 >= maj) list.add(elem2);
        return list;



    }



}
