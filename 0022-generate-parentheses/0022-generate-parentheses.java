class Solution {
    public List<String> answer = new ArrayList<>();
    public void backtrack(StringBuilder current,int n ,int usedOpen , int usedClose){
        if(usedOpen == n && usedClose == n){
            answer.add(current.toString());
            return;
        }
        if(usedOpen<n){
            current.append('(');
            backtrack(current, n, usedOpen+1 , usedClose);
            current.deleteCharAt(current.length() - 1);
        }
        if(usedClose<usedOpen){
            current.append(')');
            backtrack(current, n, usedOpen , usedClose+1);
            current.deleteCharAt(current.length() - 1);
        }
        
        

    }
    public List<String> generateParenthesis(int n) {
        StringBuilder current = new StringBuilder();
        backtrack(current, n ,0, 0);
        return answer;
    }
}