class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l =0, r =0, sum=0, ws =Integer.MAX_VALUE;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>=target){
                ws = Math.min(ws,r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return ws == Integer.MAX_VALUE? 0: ws;
    }
}