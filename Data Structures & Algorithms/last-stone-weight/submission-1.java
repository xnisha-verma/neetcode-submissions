class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        for(int k:stones){
            pq.offer(k);
        }
        while(pq.size()>1){
            int x = pq.poll();
            int y = pq.poll();
            if(x==y) pq.offer(0);
            else{
                int sub = Math.abs(y-x);
                pq.offer(sub);
            }
        }
        return pq.peek();
    }
}
