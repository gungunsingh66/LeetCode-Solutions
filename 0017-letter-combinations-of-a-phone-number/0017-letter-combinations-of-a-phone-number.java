class Solution {
    List<String> answer = new ArrayList<>();
    public void backtrack(int currDigitIndex , StringBuilder currString, String digits){
        int n = digits.length();
        String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        if(currDigitIndex == n){
            answer.add(currString.toString());
            return;
        }
        char digit = digits.charAt(currDigitIndex);
        String letters = map[digit- '0'];
        for(char ch : letters.toCharArray()){
            currString.append(ch);
            backtrack(currDigitIndex+1, currString, digits);
            currString.deleteCharAt(currString.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        StringBuilder currString = new StringBuilder();
        backtrack(0, currString, digits);
        return answer;

    }
}