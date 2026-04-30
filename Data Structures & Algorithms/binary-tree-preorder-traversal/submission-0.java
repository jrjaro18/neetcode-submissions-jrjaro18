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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> sol = new ArrayList<Integer>();
        preorder(root, sol);
        return sol;
    }
    private void preorder(TreeNode root, List<Integer> sol) {
        if (root == null) return;
        sol.add(root.val);
        preorder(root.left, sol);
        preorder(root.right, sol);
    }
}