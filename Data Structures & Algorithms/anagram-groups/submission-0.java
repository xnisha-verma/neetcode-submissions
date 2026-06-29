class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[] arr = new int[26];
            String st = strs[i];
            for(int k=0;k<st.length();k++){
                arr[st.charAt(k)-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<26;j++){
                sb.append("#");
                sb.append(arr[j]);
            }
            String s = sb.toString();
            if(!map.containsKey(s)){
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        } 
        return new ArrayList<>(map.values());
    }
}
