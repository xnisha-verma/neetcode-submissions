class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int n : asteroids) {
            while(!st.isEmpty() && n<0 && st.peek()>0){
                int diff = n+st.peek();
                if(diff>0){
                    n=0;
                }else if(diff<0){
                    st.pop();
                }else{
                    n=0;
                    st.pop();
                }
            }
            if(n!=0){
                st.push(n);
            }
        }
        int arr[] = new int[st.size()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        return arr;
    }
}