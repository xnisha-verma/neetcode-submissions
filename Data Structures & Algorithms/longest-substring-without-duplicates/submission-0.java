class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max =0, left=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                left = Math.max(left, map.get(c)+1);
            }
            max = Math.max(max, i-left+1);
            map.put(c, i);
        }

        // int left = 0, right =1, max=0;
        // while(right<s.length()){
        //     char c = s.charAt(right);
        //     if(c==s.charAt(left)){
        //         max = Math.max(max, right-left);
        //         left++;
        //     }
        //     right++;
        // }
        return max;

    }
}
