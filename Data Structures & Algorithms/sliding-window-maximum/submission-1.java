class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        
        for(int i=0;i<=nums.length-k;i++){
            int max = nums[i];
            for(int j=i;j<i+k;j++){
                max = Math.max(nums[j],max);
                
            }
            ans[i]= max;
        }

        return ans;
        // List<Integer> li = new ArrayList<>();
        // int l = 0, r = 0, max=0;
        // while (r < nums.length) {
        //     int ws = r - l + 1;
        //     // if (ws > k) {
        //     //     l++;
        //     // }
        //     max = Math.max(max,Math.max(nums[l], nums[r]));
        //     if (ws == k) {
        //         li.add(max);
        //         max-=nums[l];
        //         l++;
        //     }
        //     r++;
        // }
        // int[] ans = new int[li.size()];
        // for(int i=0;i<ans.length;i++){
        //     ans[i] = li.get(i);
        // }
        // return ans;
    }
}
