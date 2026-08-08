class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(arr, 0, target, new ArrayList<>(),ans);
        return ans;
    }
    void backtrack(int[] arr, int idx, int target, List<Integer> li, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i = idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(target<arr[i]) break;
            li.add(arr[i]);
            backtrack(arr, i+1, target-arr[i], li,ans);
            li.remove(li.size()-1);
        }
    }
}
