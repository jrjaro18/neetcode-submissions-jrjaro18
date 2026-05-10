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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        var sol = new ArrayList<List<Integer>>();
        if (root == null) return sol;
        queue.add(root);
        while(!queue.isEmpty()) {
            var row = new ArrayList<Integer>();
            var i = 0; 
            var size = queue.size();
            while (i < size) {
                var tempNode = queue.remove();
                if (tempNode.left != null) queue.add(tempNode.left);
                if (tempNode.right != null) queue.add(tempNode.right);
                row.add(tempNode.val);
                i++;
            }
            sol.add(row);
        }
        return sol;
    }
}
