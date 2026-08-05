class Solution {
    int res =0;
    public int subsetXORSum(int[] nums) {
        backtrack(0, nums, new ArrayList<>());
        return res;
    }
    private void backtrack(int i, int[] nums, List<Integer> subsets){
        int xor =0;
        for(int n: subsets) xor^=n;
        res+=xor;

        for(int j=i;j<nums.length;j++){
            subsets.add(nums[j]);
            backtrack(j+1, nums, subsets);
            subsets.remove(subsets.size()-1);
        }
    }
}