class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        for(char c: s1.toCharArray()){
            f1[c-'a']++;
        }

        int ws = s1.length(), l=0;
        for(int i=0;i<s2.length();i++){
            f2[s2.charAt(i)-'a']++;
            if(i>=ws){
                f2[s2.charAt(l)-'a']--;
                l++;
            }
            if(Arrays.equals(f1,f2)) return true;
        }
        return false;
    }
}
