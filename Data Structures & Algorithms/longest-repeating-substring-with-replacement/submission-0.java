class Solution {
    public int characterReplacement(String s, int k) {
        char[] freq = new char[26];
        int l =0, max=0, maxfreq =0;
        for(int r=0;r<s.length();r++){
            freq[s.charAt(r)-'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(r)-'A']);
            int replace = (r-l+1) - maxfreq;
            if(replace>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            max = Math.max(max,r-l+1);

        }
        return max;
    }
}
