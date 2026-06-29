class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        backtrack(nums, li, new ArrayList<>());
        return li;
    }
    void backtrack(int[] nums,List<List<Integer>> li, List<Integer> curr){
        if(curr.size()==nums.length){
            li.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(curr.contains(nums[i])) continue;
            curr.add(nums[i]);
            backtrack(nums, li, curr);
            curr.remove(curr.size()-1);
        }
    }
}
