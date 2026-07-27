class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int max  =0, num=0;
        for(int k:nums){
            mp.put(k, mp.getOrDefault(k,0)+1);
            if(mp.get(k)>max){
                max = mp.get(k);
                num = k;
            }
        }
        return num;
    }
}