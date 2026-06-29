class Solution {
    private final String[] map =
    {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> li = new ArrayList<>();
        if(digits == null || digits.length()==0) return li;
        backtrack(digits, li, 0, new StringBuilder()) ;
        return li; 
    }
    void backtrack(String digits, List<String> li, int idx, StringBuilder st){
        if(idx==digits.length()){
            li.add(st.toString());
            return;
        }
        String letters = map[digits.charAt(idx)-'0'];
        for(char ch: letters.toCharArray()){
            st.append(ch);
            backtrack(digits, li, idx+1, st);
            st.setLength(st.length()-1);
        }
    }
}
