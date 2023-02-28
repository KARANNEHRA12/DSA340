package Tree;
// public class TreeNode {

//     *     int val;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode() {}
//     *     TreeNode(int val) { this.val = val; }
//     *     TreeNode(int val, TreeNode left, TreeNode right) {
//     *         this.val = val;
//     *         this.left = left;
//     *         this.right = right;
//     *     }
//     * }

public class MaximumLevelSum {
    public int maxLevelSum(TreeNode root) {
        if (root == null)
            return 0;
        int maxSum = Integer.MIN_VALUE, CurrSum = 0, levelCount = 1;
        int levelWithMaxSum = 1;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) {

            TreeNode temp = q.poll();
            if (temp != null) {
                if (temp.left != null) {
                    q.offer(temp.left);

                }
                if (temp.right != null) {
                    q.offer(temp.right);

                }
                CurrSum += temp.val;
            } else {

                if (CurrSum > maxSum) {
                    maxSum = CurrSum;
                    levelWithMaxSum = levelCount;
                }
                levelCount++;
                CurrSum = 0;
                if (!q.isEmpty()) {
                    q.offer(null);
                }
            }
        }
        return levelWithMaxSum;

    }

}
