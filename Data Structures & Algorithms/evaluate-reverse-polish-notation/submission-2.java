class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String k : tokens) {
            if (k.equals("+")) {
                st.push(st.pop() + st.pop());
            } else if (k.equals("*")) {
                st.push(st.pop() * st.pop());

            } else if (k.equals("-")) {
                int i = st.pop();
                int j = st.pop();
                st.push(j - i);

            } else if (k.equals("/")) {
                 int i = st.pop();
                int j = st.pop();
                st.push(j / i);
            } else {
                st.push(Integer.parseInt(k));
            }
        }
        return st.peek();
    }
}
