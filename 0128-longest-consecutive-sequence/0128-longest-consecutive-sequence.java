class Solution {
    public int longestConsecutive(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int num:  nums){
        //     set.add(num);
        // }
        // int max_length = 0;
        // for(int num : set){
        //     if(!set.contains(num-1)){
        //         int current = num;
        //         int count = 1;
        //         while(set.contains(current+1)){
        //             current++;
        //             count++;
        //         }
        //         max_length = Math.max(count,max_length);  
        //     }
        // }
        // return max_length;


        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int max_len = 0;
        for(int num: set){
            if(!set.contains(num-1)){
                int current = num;
                int count = 1;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                max_len = Math.max(max_len,count);
            }
        }
        return max_len;
    }
}