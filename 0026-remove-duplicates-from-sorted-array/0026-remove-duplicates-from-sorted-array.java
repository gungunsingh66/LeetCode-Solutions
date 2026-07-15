class Solution {
    public int removeDuplicates(int[] nums) {
        // int i = 0;
        // for (int j = i + 1; j < nums.length; j++) {
        //     if (nums[i] != nums[j]) {
        //         i++;
        //         nums[i] = nums[j];
        //     }  
        // }
        // return i + 1;


        // int i = 0;
        // for(int j= i+1;j<nums.length;j++){
        //     if(nums[i] != nums[j]){
        //         i++;
        //         nums[i] = nums[j];
        //     }
        // }
        // return i+1;
        if(nums.length == 0){
            return 0;
        }
        int writeIndex = 1;
        for(int i=1 ; i<nums.length; i++){
            if(nums[i] != nums[writeIndex-1]){
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }
        return writeIndex;













    }
}