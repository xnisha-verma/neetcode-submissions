class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] result = new int[temp.length];
        Stack<int[]> st = new Stack<>();
        for(int i=0;i<temp.length;i++){
            int t = temp[i];
            while(!st.isEmpty() && t>st.peek()[0]){
                int[] pair = st.pop();
                result[pair[1]] = i-pair[1];
            }
            st.push(new int[]{t,i});
        }
        return result;
    }
}
