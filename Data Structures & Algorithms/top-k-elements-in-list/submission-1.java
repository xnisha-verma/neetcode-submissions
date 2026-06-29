class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x: nums){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        maxHeap.addAll(map.entrySet());

        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i]= maxHeap.poll().getKey();
        }
        return arr;
    }
}