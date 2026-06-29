class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> li = new ArrayList<>();
        backtrack(0, nums, li, new ArrayList<>());
        return li;
    }
    void backtrack(int idx, int[] nums, List<List<Integer>> li, List<Integer> curr){
        // if(idx==nums.length){
            li.add(new ArrayList<>(curr));

        for(int i= idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);
            backtrack(i+1, nums, li, curr);
            curr.remove(curr.size()-1);
        }
    }
}
