class MedianFinder {
    PriorityQueue<Integer> leftpq = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> rightpq = new PriorityQueue<>();
    public MedianFinder() {
    }
    
    public void addNum(int num) {
        if(leftpq.isEmpty() || num <= leftpq.peek()){
            leftpq.offer(num);
            if(leftpq.size()-rightpq.size() > 1){
                int max = leftpq.poll();
                rightpq.offer(max);
            }
        }else{
            rightpq.offer(num);
            if(leftpq.size() < rightpq.size()){
                int min = rightpq.poll();
                leftpq.offer(min);
            }
        }
    }
    
    public double findMedian() {
        if(leftpq.size() == rightpq.size()){
            return (leftpq.peek() + rightpq.peek())/2.0;
        }
        return leftpq.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */