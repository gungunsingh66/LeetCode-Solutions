class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    private void backtrack(int index,int remainingTarget,List<Integer> currentCombination, int[] candidates ){
        if(remainingTarget == 0){
            answer.add(new ArrayList<>(currentCombination));
            return;
        }
        if(remainingTarget < 0 || index == candidates.length){
            return;
        }
        currentCombination.add(candidates[index]);
        backtrack(index, remainingTarget - candidates[index], currentCombination , candidates);
        currentCombination.remove(currentCombination.size() - 1);
        backtrack(index+1, remainingTarget, currentCombination , candidates);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> currentCombination = new ArrayList<>();
        backtrack(0,target,currentCombination, candidates);
        return answer;
    }
}