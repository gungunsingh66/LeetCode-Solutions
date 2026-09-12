class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int i = 0;
        int maxReach = 0;
        while(i < n){
            if(i>maxReach) return false;
            else{
                maxReach = Math.max(nums[i] + i, maxReach);
                i++;
            }
            if(maxReach >= n-1) return true;
        }
        return true;
    }
}