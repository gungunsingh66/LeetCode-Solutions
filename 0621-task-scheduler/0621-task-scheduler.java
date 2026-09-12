class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(int i = 0; i < tasks.length; i++){
            char ch = tasks[i];
            freq[ch - 'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        Queue<int[]> cooldown = new LinkedList<>();

        int currentTime = 0;
        for(int f: freq){
            if(f >0){
                pq.offer(f);
            }
        }
        while(!pq.isEmpty() ||  !cooldown.isEmpty()){
            currentTime++;
            while(!cooldown.isEmpty() && cooldown.peek()[1] <= currentTime){
                int[] task = cooldown.poll();
                pq.offer(task[0]);
            }
            int frequency = 0;
            if(!pq.isEmpty()){
                frequency = pq.poll();
                frequency--;
            }
            if(frequency > 0){
                cooldown.add(new int[]{frequency, currentTime + n + 1});
            }
        }
        return currentTime;
    }
}