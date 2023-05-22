public class DuplicateInarary {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
//        int [] freq= new int[n];
//        for (int i = 0; i < n ; i++) {
//            if( freq[i] == 0){
//                freq[i]++;
//            }
//            else {
//                 return freq[i];
//            }
//
//        }
//         return 0;
        // more optimisez appproach this method is called Swap Sort
//         here Indx +1 -> missing number/
//        and nums[i] -> repeating number

        for (int i = 0; i < n ; i++) {
             int indx = Math.abs(nums[i] ) -1;
             int val = nums[indx];
             if( val < 0 )
             {
                  return indx + 1;

             }
              else {
                  nums[indx]  *= -1;

             }

        }
         return 0;

    }
}
