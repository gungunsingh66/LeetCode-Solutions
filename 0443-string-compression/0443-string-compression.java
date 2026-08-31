class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int read = 0;
        int write = 0;
        while(read<n){
            char currChar = chars[read];
            int count = 0;
            int next= read;
            while(next<n && currChar == chars[next]){
                count++;
                next++;
            }
            chars[write] = currChar;
            write++;
            if(count>1){
                String cnt = String.valueOf(count);
                for(int i = 0; i<cnt.length(); i++){
                    chars[write] = cnt.charAt(i);
                    write++;
                }
            }
            read = next;
        }
        return write;
    }
}