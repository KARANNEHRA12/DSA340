import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

//Note: arraylist m hi reverse krna hota hai
public class NextGreaterRight {
    public ArrayList<Integer> NextGreaterToRight(ArrayList<Integer> nums, int size) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = size - 1; i >= 0; i--) {
            if (s.empty())
                ans.add(-1);
            else if (s.size() > 0 && s.peek() > nums.get(i)) {
                ans.add(nums.get(i));
            } else if (s.size() > 0 && s.peek() <= nums.get(i)) {
                while (s.size() > 0 && s.peek() <= nums.get(i)) {
                    s.pop();

                }
                if (s.size() == 0) {
                    ans.add(-1);

                } else
                    ans.add(nums.get(i));

            }
            s.push(nums.get(i));
        }
        Collections.reverse(ans);
        return ans;

    }

}
