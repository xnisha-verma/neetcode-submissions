class FreqStack {
    private Map<Integer, Integer> map;
    private List<Integer> st;
    public FreqStack() {
        map = new HashMap<>();
        st = new ArrayList<>();
    }
    
    public void push(int val) {
        st.add(val);
        map.put(val, map.getOrDefault(val,0)+1);
    }
    
    public int pop() {
        int max = Collections.max(map.values());
        int i = st.size()-1;
        while(map.get(st.get(i))!=max){
            i--;
        }
        int val = st.remove(i);
        map.put(val, map.get(val)-1);
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */