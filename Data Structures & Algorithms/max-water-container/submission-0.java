class Solution {
    public int maxArea(int[] heights) {
        int max =0;
        int l =0, r = heights.length-1;
        while(l<r){
            int minH = Math.min(heights[l],heights[r]);
            max = Math.max(max, minH*(r-l));
            // if()
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
