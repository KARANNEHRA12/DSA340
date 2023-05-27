import java.util.Scanner;

public class MaxSumSubArray {
    // boiler plate for Siding Window
    public static long maxSumSubarray(int[] arr, int n , int k ){
        int i =0; int j =0; long sum =0;
         long max = Integer.MIN_VALUE;
         while( j< n)
         {
             sum += arr[j];
             if( j - i +1 < k  ){
                 j++;
             }
             else if( j - i + 1 == k){
                 max = Math.max(sum, max);
                 sum -= arr[i];
                 i++; j++;
             }
         }

        return max;

         // if duplicate are not allowed in subarray
//        int i =0; int j =0; long sum =0;
//        int n = arr.length;
//        long max = 0;
//        HashSet<Integer> hs = new HashSet<>();
//        while( j< n)
//        {
//            while( hs.contains(arr[j])){
//                hs.remove(arr[j]);
//                sum -= arr[i];
//                i++;
//            }
//            hs.add(arr[j]);
//            sum += arr[j];
//            if( j - i + 1 < k  ){
//                j++;
//            }
//            else if( j - i + 1 == k){
//                max = Math.max(sum, max);
//                hs.remove(arr[i]);
//                sum -= arr[i];
//                i++; j++;
//            }
//        }
//
//        return max;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = scn.nextInt();

        }
        int k = scn.nextInt();
        System.out.println("maxSumSubarray(arr, n, k) is " + maxSumSubarray(arr, n, k));


    }
}
