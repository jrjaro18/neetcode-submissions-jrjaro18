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
    int sol = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return sol;
    }
    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int maxFromLeft = dfs(node.left);
        int maxFromRight = dfs(node.right);
        
        int one = maxFromLeft + node.val;
        int two = maxFromRight + node.val; 
        int three = node.val;

        int four = maxFromLeft + node.val + maxFromRight;

        sol = Math.max(sol, Math.max(one, Math.max(two, Math.max(three, four))));
        return Math.max(one, Math.max(two, three));

    }
}
