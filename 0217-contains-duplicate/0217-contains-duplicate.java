class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Set<Integer> intSet = new HashSet<>();
        // for(int num : nums){
        //     if(intSet.contains(num)){
        //         return true;
        //     }
        //     intSet.add(num);
        // }
        // return false;

        HashSet<Integer> set = new HashSet<>();
        for(int num :nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;

    }
}