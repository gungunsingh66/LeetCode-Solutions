class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int p1 = m-1;
        // int p2 = n-1;
        // int p = m + n-1;
        // while(p1>=0 && p2>=0){
        //     if(nums1[p1]>nums2[p2]){
        //         nums1[p] = nums1[p1];
        //         p1--;
        //     }else{
        //         nums1[p] = nums2[p2];
        //         p2--;
        //     }
        //     p--;
        // }
        // while(p2>=0){
        //     nums1[p] = nums2[p2];
        //     p2--;
        //     p--;
        // }
        int len = m+n-1;
        int len1 = m-1;
        int len2 = n-1;
        while(len1>=0 && len2>=0){
            if(nums2[len2]> nums1[len1]){
                nums1[len] = nums2[len2];
                len--;
                len2--;
            }else{
                nums1[len] = nums1[len1];
                len--;
                len1--;
            }
        }
        while(len2>=0){
            nums1[len] = nums2[len2];
            len2--;
            len--;
        }
        
    }
}