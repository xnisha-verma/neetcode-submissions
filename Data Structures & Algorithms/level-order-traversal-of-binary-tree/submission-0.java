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
        List<List<Integer>> li = new ArrayList<>();
        if(root==null) return li;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int levelsize = qu.size();
            List<Integer> currLi = new ArrayList<>();

            for(int i=0;i<levelsize;i++){
                TreeNode curr = qu.poll();
                currLi.add(curr.val);

                if(curr.left!=null) qu.offer(curr.left);
                if(curr.right!=null) qu.offer(curr.right);
            }
            li.add(currLi);
        }
        return li;

    }
}
