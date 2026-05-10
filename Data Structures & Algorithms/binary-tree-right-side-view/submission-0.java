/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private int maxDepth = Integer.MIN_VALUE;
    public List<Integer> rightSideView(TreeNode root) {
        var rightView = new ArrayList<Integer>();
        dfs(root, rightView, 1);
        return rightView;
    }
    private void dfs(TreeNode root, ArrayList<Integer> sol, int depth) {
        if (root == null) return;
        if (depth > maxDepth) {
            sol.add(root.val);
            maxDepth = depth;
        }
        dfs(root.right, sol, depth+1);
        dfs(root.left, sol, depth+1);
    }
}
