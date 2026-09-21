class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i<s.length(); i++){
            if(mapS[s.charAt(i)] != mapT[t.charAt(i)]) return false;
            mapS[s.charAt(i)]= i+1;
            mapT[t.charAt(i)]= i+1;
        }
        return true;





        // HashMap<Character,Character> map = new HashMap<>();
        // HashSet<Character> used = new HashSet<>();
        // if(s.length() != t.length()){
        //     return false;
        // }
        // for(int i = 0; i<s.length();i++){
        //     if(map.containsKey(s.charAt(i))){
        //         if(map.get(s.charAt(i)) != t.charAt(i)){
        //             return false;
        //         }
        //     }else{
        //         if(used.contains(t.charAt(i))){
        //             return false;
        //         }
        //     }
            
        //     map.put(s.charAt(i),t.charAt(i));
        //     used.add(t.charAt(i));
        // }
        // return true;

        // HashMap<Character,Character> sToT = new HashMap<>();
        // HashMap<Character,Character> tToS = new HashMap<>();

        // if(s.length() != t.length()){
        //     return false;
        // }
        // for(int i = 0; i<s.length();i++){
        //     char sChar = s.charAt(i);
        //     char tChar = t.charAt(i);
        //     if(sToT.containsKey(sChar) && sToT.get(sChar) != tChar){
        //         return false;
        //     }else if(tToS.containsKey(tChar) && tToS.get(tChar) != sChar){
        //         return false;
        //     }
        //     sToT.put(sChar,tChar);
        //     tToS.put(tChar, sChar);
        // }
        // return true;

    }
}