class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int k: nums){
            if(mp.containsKey(k)) return true;
            mp.put(k, mp.getOrDefault(k,0)+1);
        }
        return false;
    }
}