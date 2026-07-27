class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left =0, right=0;
        for(int k:weights){
            left = Math.max(k, left);
            right+=k;
        }
        int capacity = 0;
        while(left<=right){
            capacity = left + (right-left)/2;
            if(canShip(capacity, weights, days)){
                right = capacity-1;
            }else{
                left = capacity+1;
            }
        }
        return left;
    }
    boolean canShip(int capacity, int[] weights, int days){
        int day =1, load=0;
        for(int k: weights){
            if(load+k<=capacity){
                load+=k;
            }else{
                load = k;
                day++;
            }
            if(day>days) return false;
        }
        return true;
    }
}