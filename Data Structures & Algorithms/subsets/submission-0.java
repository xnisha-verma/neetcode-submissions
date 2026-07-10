class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       backtrack(0,nums, ans, new ArrayList<>());
       return ans; 
    }
    void backtrack(int idx, int[] nums, List<List<Integer>> ans, List<Integer> li){
        if(idx==nums.length){
            ans.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[idx]);
        backtrack(idx+1, nums, ans, li);
        li.remove(li.size()-1);
        backtrack(idx+1, nums, ans, li);
    }
}
