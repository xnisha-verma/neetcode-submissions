class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<>();
        backtrack(n,"",li,0,0);
        return li;

    }
    void backtrack(int n, String s, List<String> li, int open, int closed){
        if(s.length()==2*n){
            li.add(s);
            return;
        }
        if(open<n){
            backtrack(n,s+"(",li,open+1,closed);
        }
        if(closed<open){
            backtrack(n,s+")",li,open,closed+1);
        }
    }
}
