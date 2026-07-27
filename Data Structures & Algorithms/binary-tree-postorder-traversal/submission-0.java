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
    public List<Integer> postorderTraversal(TreeNode root) {
        li = new ArrayList<>();
        postorder(root);
        return li;
    }
    private void postorder(TreeNode node){
        if(node==null) return ;
        postorder(node.left);
        postorder(node.right);
        li.add(node.val);
    }
}