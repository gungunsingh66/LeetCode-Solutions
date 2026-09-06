class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(map.get(a),map.get(b)));
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(pq.size()<k){
                pq.offer(entry.getKey());
            }else{
              if(entry.getValue() > map.get(pq.peek())){
                pq.poll();
                pq.offer(entry.getKey());
              } 
            }
        }
        int[] ans = new int[k];
        for(int i = 0; i <k; i++){
            ans[i] = pq.poll();
        }
        return ans;
    }
}