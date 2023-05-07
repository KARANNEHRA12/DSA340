import java.util.*;

// Syntax: The pair class in the Java methodsss

// Pair<Key Type, Value Type> var_name = new Pair<>(key, value);
// Pair (K key, V value): Creates a new pair.
// // boolean equals(): It is used to compare two pairs of objects. It does a deep comparison, i.e., it compares on the basis of the values (<Key, Value>) which are stored in the pair objects.   
// Accessing values: Using getKey() and getValue() methods we can access a Pair object’s values.

//    1. getKey(): gets the first value.
//    2. getValue(): gets the second value

// Note: Here, <Key, Value> refers to a pair of values that are stored together. It is not like <Key, Value> pair which is used in Map.

public class StockSpan {
    public ArrayList<Integer> NextGreaterToLeft(ArrayList<Integer> nums, int size) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Pair<Integer, Integer>> s = new Stack<>();
        // Pair class first NGL and second - index of NGL
        for (int i = 0; i < size; i++) {
            if (s.empty())
                ans.add(-1);
            else if (s.size() > 0 && s.peek().getKey() > nums.get(i)) {
                ans.add(s.peek().getValue());
            } else if (s.size() > 0 && s.peek().getKey() <= nums.get(i)) {
                while (s.size() > 0 && s.peek().getKey() <= nums.get(i)) {
                    s.pop();

                }
                if (s.size() == 0) {
                    ans.add(-1);

                } else
                    ans.add(s.peek().getValue());

            }
            s.push(new Pair<>(nums.get(i), i));
        }
        return ans;

    }

}
