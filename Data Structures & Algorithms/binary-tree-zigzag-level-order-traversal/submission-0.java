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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        int flag =0;
        while(!qu.isEmpty()){
            List<Integer> li = new ArrayList<>();
            int size = qu.size();
                for(int i=0;i<size;i++){
                    TreeNode temp = qu.poll();
                    li.add(temp.val);
                    if(temp.left!=null) qu.offer(temp.left);
                    if(temp.right!=null) qu.offer(temp.right);
                }
                if(flag==0){
                    ans.add(li);
                    flag =1;
                }else{
                    Collections.reverse(li);
                    ans.add(li);
                    flag =0;
                }
        }
        return ans; 
    }
}