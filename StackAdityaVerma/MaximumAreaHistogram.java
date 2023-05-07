import java.util.*;

public class MaximumAreaHistogram {
    public int[] NextSmallerToLeft(int[] nums, int size) {

        int[] ans = new int[size];
        Stack<Pair<Integer, Integer>> s = new Stack<>();
        for (int i = 0; i < size; i++) {
            if (s.empty())
                ans[i] = -1;
            else if (s.size() > 0 && s.peek().getKey() < nums[i]) {
                ans[i] = s.peek().getValue();
            } else if (s.size() > 0 && s.peek().getKey() >= nums[i]) {
                while (s.size() > 0 && s.peek().getKey() >= nums[i]) {
                    s.pop();

                }
                if (s.size() == 0) {
                    ans[i] = -1;

                } else
                    ans[i] = s.peek().getValue();

            }
            s.push(new Pair<>(nums[i], i));
        }
        return ans;

    }

    public int[] NextSmallerToRight(int[] nums, int size) {
        int[] ans = new int[size];
        Stack<Pair<Integer, Integer>> s = new Stack<>();
        for (int i = size - 1; i >= 0; i--) {
            if (s.empty())
                ans[i] = size;
            else if (s.size() > 0 && s.peek().getKey() < nums[i]) {
                ans[i] = s.peek().getValue();
            } else if (s.size() > 0 && s.peek().getKey() >= nums[i]) {
                while (s.size() > 0 && s.peek().getKey() >= nums[i]) {
                    s.pop();

                }
                if (s.size() == 0) {
                    ans[i] = size;

                } else
                    ans[i] = s.peek().getValue();

            }
            s.push(new Pair<>(nums[i], i));
        }
        reverse(ans, size);
        return ans;

    }

    void reverse(int a[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

    }

    public int largestRectangleArea(int[] heights) {
        int size = heights.length;
        int[] left = NextSmallerToLeft(heights, size);
        int[] right = NextSmallerToRight(heights, size);
        int[] width = new int[size];
        int ans[] = new int[size];
        for (int i = 0; i < size; i++) {
            width[i] = right[i] - left[i] - 1;

        }
        for (int i = 0; i < size; i++) {
            ans[i] = width[i] * heights[i];

        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (max > ans[i])
                max = ans[i];

        }
        return max;

    }
}
