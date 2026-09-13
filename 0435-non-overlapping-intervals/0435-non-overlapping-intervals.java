class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));
        int remove = 0;
        int previousEnd = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(previousEnd > intervals[i][0]){
                remove++;
            }else{
                previousEnd = intervals[i][1];
            }
        }
        return remove;
    }
}