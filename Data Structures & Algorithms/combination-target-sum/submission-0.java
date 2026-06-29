class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> li = new ArrayList<>();
        backtrack(nums,target, 0, new ArrayList<>(), li);
        return li;
    }
    void backtrack(int[] nums, int target, int idx, List<Integer> curr, List<List<Integer>> li){
        if(target==0){
            li.add(new ArrayList<>(curr));
            return;
        }
        if(idx==nums.length || target<0){
            return;
        }
        curr.add(nums[idx]);
        backtrack(nums, target-nums[idx], idx, curr, li);
        curr.remove(curr.size()-1);
        backtrack(nums, target, idx+1, curr, li);
    }
}
