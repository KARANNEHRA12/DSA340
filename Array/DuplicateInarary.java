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

    //----------------Swap Sort Algorithm-----------------------
    // this is the preprocessing code
    // int i =0;
    // this is for swap element to theri ideal position
//    while(i< nums.length){
//            if( nums[i] != nums[nums[i] -1]){
//                 swap( nums[i], nums[nums[i] -1]);
//
//        }
//            else i++;
//    }
    // Now checking for duplicate and missing
//     for( int i =0 ; i< size; i++){
//         if( nums[i] !=  i+1){
//     we can add these element to list or as per question
//             mising_number  =  i+1;
//             duplicate =  nums[i];
//         }
//    }
}
