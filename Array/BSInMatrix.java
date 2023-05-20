public class BSInMatrix {

//    public boolean searchMatrix(int[][] matrix, int target) {
//         int m = matrix.length;
//         int n = matrix[0].length;
//        if(matrix.length == 0) return false;
//         int i=0; int j= n-1;
//         while( j>=0 && i<m){
//             if( matrix[i][j] == target){
//                 return true;
//             }
//             else if(matrix[i][j] < target){
//                 i++;
//             }
//             else {
//                 j--;
//             }
//         }
//          return false;
//
//    }

    // another approach using BS
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(matrix.length == 0) return false;
         int l =0 ; int h =( m* n) -1;
         while( l<= h){
             int mid = l +(  h-l) /2;
             // mid/ n where n is column while given row index and mid % n will give column index
              if( matrix[mid/n][mid%n] ==  target){
                  return true;
              }
               else if( matrix[mid/n][mid%n] < target){
                   l = mid +1;
              }
                else {
                    h = mid-1;
              }

         }
          return false;

    }

}
