class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String k : operations) {
            if(k.matches("-?\\d+")) {
                int num = Integer.valueOf(k);
                st.push(num);
            } 
            if (st.size() >= 2 && k.equals("+")) {
                int i = st.pop();
                int j = st.pop();
                st.push(j);
                st.push(i);
                st.push(i+j);
            }else if (!st.isEmpty()) {
                if (k.equals("D")) {
                    int d = st.pop();
                    st.push(d);
                    d = d * 2;
                    st.push(d);
                }else if(k.equals("C")){
                    st.pop();
                }
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}