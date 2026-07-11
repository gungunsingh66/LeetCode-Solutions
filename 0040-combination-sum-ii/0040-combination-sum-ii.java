class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    public void backtrack(int index, int remainingTarget, List<Integer> currentCombination ,int[] candidates){
        
        if(remainingTarget == 0){
            answer.add(new ArrayList<>(currentCombination));
            return;
        }
        if(remainingTarget < 0 || index == candidates.length){
            return;
        }
        for(int i = index; i< candidates.length; i++){
            if(i>index && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i] > remainingTarget)
                break;
            currentCombination.add(candidates[i]);
            backtrack(i+1, remainingTarget - candidates[i], currentCombination, candidates);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> currentCombination = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, target , currentCombination, candidates);
        return answer;
    }
}