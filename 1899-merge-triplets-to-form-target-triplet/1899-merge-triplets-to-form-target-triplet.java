class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean[] found = {false, false, false};
        for(int[] triplet: triplets){
            if(triplet[0] > target[0] || triplet[1] > target[1] ||triplet[2] > target[2]){
                continue;
            }
            for(int j = 0; j < 3; j++){
                if(triplet[j] == target[j]){
                        found[j] = true;
                }
            }
        }
        return found[0] && found[1] && found[2];
    }
}