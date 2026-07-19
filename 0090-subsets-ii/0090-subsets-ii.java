class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    public void backtrack(List<Integer> currComb,int index,int[] nums){
        answer.add(new ArrayList<>(currComb)); 
        for(int i = index ;i < nums.length; i++){
            
            if(i>index && nums[i] == nums[i-1]){
                continue;
            }
            currComb.add(nums[i]);
            backtrack(currComb , i+1, nums);

            currComb.remove(currComb.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> currComb = new ArrayList<>();
        backtrack(currComb, 0, nums);
        return answer;
    }
}