class Solution {
    public int removeDuplicates(int[] nums) {
       int lastIdx =0, count=0;
       for(int i=1;i<nums.length;i++){
        if(nums[lastIdx]!=nums[i]){
            nums[lastIdx+1] = nums[i];
            lastIdx++;
        }
       }
       return lastIdx+1;
    }
}