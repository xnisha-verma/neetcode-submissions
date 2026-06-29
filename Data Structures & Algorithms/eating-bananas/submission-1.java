class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1, high =0;
        for(int k: piles ){
            high = Math.max(high, k);
        }
        int ans = high;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(canfinish(piles, h, mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    private boolean canfinish(int[] piles, int h, int speed){
        int hour =0;
        for(int k: piles){
            hour+=(int)Math.ceil((double)k/speed);
        }
        if(hour<=h) return true;
        return false;
    }
}
