class Solution {
    public int expand(String s, int left , int right){
        while(left>=0 && right<=s.length()-1 && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left -1;
    }
    public String longestPalindrome(String s) {
        int len = 0;
        int start = 0;
        int end = 0;
        String longestSubstring = "";
        for(int i = 0 ; i < s.length()-1; i++){
            int oddLen = expand(s,i,i);
            int evenLen = expand(s,i,i+1);
            len = Math.max(oddLen, evenLen);
            if(len>end-start+1){
                start = i- (len-1)/2;
                end = i+ len/2;
            }
        }
        return s.substring(start,end+1);

    }
}