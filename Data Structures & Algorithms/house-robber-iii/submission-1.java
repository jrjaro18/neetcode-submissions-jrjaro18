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
    public int rob(TreeNode root) {
        var sol = robIt(root);
        return Math.max(sol[0], sol[1]);
    }
    private int[] robIt(TreeNode node) {
        if (node == null) return new int[]{0,0};
        var left = robIt(node.left);
        var right = robIt(node.right);

        int inclusiveOfLeftOrRight = Math.max(left[0], left[1]) + Math.max(right[0], right[1]); 
        int exclusiveOfLeftRight = left[1]+right[1]+node.val;

        return new int[]{exclusiveOfLeftRight, inclusiveOfLeftOrRight};
    }
}