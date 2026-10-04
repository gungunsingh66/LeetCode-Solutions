class Solution {
    public String decodeString(String s) {
        int n = s.length();
        Stack<StringBuilder> prevString = new Stack<>();
        Stack<Integer> counts = new Stack<>();
        int currentCount = 0;
        StringBuilder currentString = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                int digit = ch-'0';
                currentCount = currentCount*10 + digit;
            }else if(ch ==  '['){
                prevString.push(currentString);
                counts.push(currentCount);
                currentCount = 0;
                currentString = new StringBuilder();
            }else if(Character.isLetter(ch)){
                currentString.append(ch);
            }else{
                int repeat = counts.pop();
                StringBuilder prev = prevString.pop();
                for(int i = 0 ; i< repeat; i++){
                    prev.append(currentString);
                }
                currentString = prev;
            } 
        }
        return currentString.toString();
    }
}