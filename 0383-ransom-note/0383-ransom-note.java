class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // HashMap<Character,Integer> map = new HashMap<>();
        // for(int i = 0; i<magazine.length(); i++){
        //     char currChar = magazine.charAt(i);
        //     map.put(currChar,map.getOrDefault(currChar,0)+1);
        // }
        // for(int i = 0; i<ransomNote.length(); i++){
        //     char currChar = ransomNote.charAt(i);
        //     if(map.containsKey(currChar)){
        //         if(map.get(currChar)>0){
        //             map.put(currChar,map.getOrDefault(currChar,0)-1);
        //         }else{
        //             return false;
        //         }
        //     }else{
        //         return false;
        //     }
        // }
        // return true;

        int[] freq = new int[26];
        for(int i=0 ; i<magazine.length(); i++){
            char ch = magazine.charAt(i);
            freq[ch-'a']++;
        }
        for(int i=0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(freq[ch-'a']>0){
                freq[ch-'a']--;
            }else{
                return false;
            }
            
        }
        return true;
    }
}