class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int k:piles){
            max = Math.max(k,max);
        }
        int l =1, r = max, min = max;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(canfinish(piles, mid, h)){
                min = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return min;
    }
    boolean canfinish(int[] piles, int speed, int h){
        int hrs = 0;
        for(int k: piles){
            hrs+=((k+speed-1)/speed);
             if(hrs>h) return false;
        }
        return true;
    }
}
