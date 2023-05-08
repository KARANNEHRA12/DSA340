import java.util.*;

public class MaximumAreaHistogram {

    public static class Pair<T, U> {
        private T first;
        private U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public void setFirst(T first) {
            this.first = first;
        }

        public U getSecond() {
            return second;
        }

        public void setSecond(U second) {
            this.second = second;
        }
    }

    public static int[] NextSmallerToLeft(int[] nums, int size) {
        int[] ans = new int[(int) size];
        Stack<Pair<Integer, Integer>> s = new Stack<>();
        for (int i = 0; i < size; i++) {
            if (s.size() == 0)
                ans[i] = -1;
            else if (s.size() > 0 && s.peek().getFirst() < nums[(int) i]) {
                ans[i] = s.peek().getSecond();
            } else if (s.size() > 0 && s.peek().getFirst() >= nums[(int) i]) {
                while (s.size() > 0 && s.peek().getFirst() >= nums[(int) i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    ans[i] = -1;
                } else {
                    ans[i] = s.peek().getSecond();
                }
            }
            s.push(new Pair<>(nums[(int) i], i));
        }
        return ans;
    }

    public static int[] NextSmallerToRight(int[] nums, int size) {
        int[] ans = new int[(int) size];
        Stack<Pair<Integer, Integer>> s = new Stack<>();
        for (int i = size - 1; i >= 0; i--) {
            if (s.size() == 0)
                ans[i] = size;
            else if (s.size() > 0 && s.peek().getFirst() < nums[(int) i]) {
                ans[i] = s.peek().getSecond();
            } else if (s.size() > 0 && s.peek().getFirst() >= nums[i]) {
                while (s.size() > 0 && s.peek().getFirst() >= nums[i]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    ans[i] = size;
                } else {
                    ans[i] = s.peek().getSecond();
                }
            }
            s.push(new Pair<>(nums[i], i));
        }
        // reverse(ans);
        return ans;
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int largestRectangleArea(int[] heights) {
        int size = heights.length;
        int[] left = NextSmallerToLeft(heights, size);
        int[] right = NextSmallerToRight(heights, size);

        int[] width = new int[size];
        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            width[i] = right[i] - left[i] - 1;

        }
        for (int i = 0; i < size; i++) {
            ans[i] = width[i] * heights[i];

        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (max < ans[i])
                max = ans[i];

        }
        return max;

    }
}
