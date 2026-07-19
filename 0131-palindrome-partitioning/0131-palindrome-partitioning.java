class Solution {
    List<List<String>> answer = new ArrayList<>();
    boolean isPalindrome(String str, int left, int right){
        int start = left;
        int end = right-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++; 
            end--;
        }
        return true;
    }
    private void backtrack(List<String> currPartition, int index, String s){
        if(index == s.length()){
            answer.add(new ArrayList<>(currPartition));
            return;
        }
        for(int end = index; end < s.length(); end++){
            if(isPalindrome(s,index, end+1)){
                currPartition.add(s.substring(index,end+1));
                backtrack(currPartition, end+1, s);
                currPartition.remove(currPartition.size() - 1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<String> currPartition = new ArrayList<>();
        backtrack(currPartition, 0 , s);
        return answer;
    }
}