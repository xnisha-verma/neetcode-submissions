class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(!st.isEmpty() && st.peek()==map.get(c)){
                    st.pop();
                }else{
                    return false;
                }
            }else{
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}


// for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (c == '[' || c == '{' || c == '(') {
//                 st.push(c);
//             } else if (!st.isEmpty()) {
//                 if (c == '}' && st.peek() == '{') {
//                     st.pop();
//                 } else if (c == ']' && st.peek() == '[') {
//                     st.pop();
//                 } else if (c == ')' && st.peek() == '(') {
//                     st.pop();
//                 } else {
//                     return false;
//                 }
//             } else {
//                 return false;
//             }
//         }
//         return st.isEmpty();