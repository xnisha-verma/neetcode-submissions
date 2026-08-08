class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, ans, new ArrayList<>());
        return ans;
    }
    void backtrack(int idx, int[] nums, List<List<Integer>> ans, List<Integer> li){
        if(li.size()==nums.length){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(li.contains(nums[i])) continue;
            li.add(nums[i]);
            backtrack(idx+1,nums,ans,li);
            li.remove(li.size()-1);
        }
    }
}
