import java.util.ArrayList;

public class MaxAreaRectInMatrix {
    MaximumAreaHistogram mah = new MaximumAreaHistogram();

    public int maximalRectangle(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix[0].length; i++) {
            ans.get((int) matrix[0][i]);
        }
        int max = mah.largestRectangleArea(ans);
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '0') {
                    ans.get(j) = 0;
                } else
                    ans.get(j) = ans.get(j) + matrix[i][j];

            }
            max = Math.max(max, mah.largestRectangleArea(ans));
        }
        return max;
    }

}
