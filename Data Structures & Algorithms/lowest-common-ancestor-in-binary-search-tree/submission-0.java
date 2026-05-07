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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < q.val) return dfs(root, p.val, q.val);
        return dfs(root, q.val, p.val);
    }

    private TreeNode dfs(TreeNode root, int p, int q) {
        if (root.val > p && root.val < q) return root;
        if (root.val == p) return root;
        if (root.val == q) return root;
        if (root.val > p) return dfs(root.left, p, q);
        return dfs(root.right, p, q);
    }
}
