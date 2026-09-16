class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find Pivot
        int pivot = -1;
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: Find Successor and Swap
        if(pivot != -1) {
            for(int i = n - 1; i > pivot; i--) {
                if(nums[i] > nums[pivot]) {
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }
        }
        int left = pivot+1;
        int right = n-1;
        while(left<right){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
    }
}