class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int actual_sum = (n*(n+1))/2;
        // int current_sum = 0;
        // for(int i = 0; i<n;i++){
        //     current_sum = current_sum + nums[i];
        // }
        // return actual_sum - current_sum;

        int xor = nums.length;
        for(int i = 0; i<nums.length;i++){
            xor ^= i;
            xor ^= nums[i];
        }
        return xor;
    }
}