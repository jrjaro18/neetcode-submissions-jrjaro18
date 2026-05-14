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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (isALeaf(root, target)) return null;
        return root;
    }
    private boolean isALeaf(TreeNode node, int target) {
        if (node == null) return false;
        if (isALeaf(node.left, target)) node.left = null;
        if (isALeaf(node.right, target)) node.right = null;
        if (node.left == null && node.right == null && node.val == target) return true;
        return false;
    }
}