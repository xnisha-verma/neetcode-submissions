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
    private List<Integer> li;
    public List<Integer> preorderTraversal(TreeNode root) {
        li = new ArrayList<>();
        preorder(root);
        return li;
    }
    private void preorder(TreeNode node){
        if(node==null) return;
        li.add(node.val);
        preorder(node.left);
        preorder(node.right);
    }
}