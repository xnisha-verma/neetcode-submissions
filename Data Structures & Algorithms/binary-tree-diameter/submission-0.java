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
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        // if(root==null) return 0;
        calculate(root);
        return max;
    }
    int calculate(TreeNode root){
        if(root==null) return 0;
        int left = calculate(root.left);
        int right = calculate(root.right);

        max = Math.max(max, right+left);

        return 1+ Math.max(right, left);
    }
}
