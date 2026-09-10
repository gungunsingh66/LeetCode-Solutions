class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[0] * b[0] + b[1] *b[1], a[0]*a[0] + a[1] *a[1]));
        for(int i=0; i<points.length; i++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            double distance = (x1 * x1) + (y1 * y1);
            if(pq.size() < k){
                pq.offer(points[i]);
            }else{
                int[] point = pq.peek();
                int x = point[0];
                int y = point[1];
                double dist = (x*x) + (y*y);
                if(dist > distance){
                    pq.poll();
                    pq.offer(points[i]);
                }
            }
        }
        int[][] result = new int[k][2];
        int i = 0;
        while(!pq.isEmpty()){
            result[i++] = pq.poll();
        }

        return result;
    }
}