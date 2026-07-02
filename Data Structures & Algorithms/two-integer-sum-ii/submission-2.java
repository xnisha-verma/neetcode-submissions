class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l =0, r = nums.length-1;
        while(l<r){
            int sum =  nums[l]+nums[r];
            if(target==sum){
                return new int[]{l+1, r+1};
            }else if(target<sum){
                r--;
            }else{
                l++;
            }
        }
        return new int[]{};
    }
}
//less optimized for space complexity

// HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             int remain = target-nums[i];
//             if(map.containsKey(remain)){
//                 return new int[]{map.get(remain)+1,i+1};
//             }
//             map.put(nums[i], i);
//         }
//         return new int[]{};