class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(nums1[a[0]] + nums2[a[1]], nums1[b[0]] + nums2[b[1]]));
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < Math.min(k,nums1.length); i++){
            pq.offer(new int[]{i,0}); 
        }
        while(!pq.isEmpty() && ans.size() < k){
            int[] index = pq.poll();
            ans.add(Arrays.asList(nums1[index[0]],nums2[index[1]]));
            if(index[1] + 1 < nums2.length){
                pq.offer(new int[]{index[0], index[1]+1});
            }
        }
        return ans;
    }
}