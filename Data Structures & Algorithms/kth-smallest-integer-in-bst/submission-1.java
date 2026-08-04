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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> li = new ArrayList<>();
        dfs(root, li);
        Collections.sort(li);
        return li.get(k-1);

    }
    private void dfs(TreeNode node, List<Integer> li){
        if(node==null) return;
        li.add(node.val);
        dfs(node.left, li);
        dfs(node.right, li);
    }
}
