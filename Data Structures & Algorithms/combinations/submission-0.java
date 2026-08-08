class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1,n, k, ans, new ArrayList<>());
        return ans;
    }
    void backtrack(int idx,int n, int k, List<List<Integer>> ans, List<Integer> li){
        if(li.size()==k){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=idx;i<=n;i++){
            li.add(i);
            backtrack(i+1,n,k,ans,li);
            li.remove(li.size()-1);
            // backtrack(i+1,n,k,ans,li);
        }
    }
}