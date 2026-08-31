class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }
    public int findFirst(int[] nums, int target){
        int low = 0;
        int high = nums.length -1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                if(mid>0 && nums[mid-1] != target){
                    ans = mid;
                    return ans;
                }else{
                    ans = mid;
                    high = mid -1;
                }
            }else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }

    public int findLast(int[] nums, int target){
        int low = 0;
        int high = nums.length -1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                if(mid<nums.length-1 && nums[mid+1] != target){
                    ans = mid;
                    return ans;
                }else{
                    ans = mid;
                    low = mid +1;
                }
            }else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}