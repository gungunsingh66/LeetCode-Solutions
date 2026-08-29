class Solution {
    public boolean canFinish(int[] piles,int h, int k){
        int hours = 0;
        for(int i = 0; i< piles.length; i++){
            hours += (piles[i] +k -1)/k;
            if(hours>h){
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxPile = piles[0];
        for(int i =1 ; i<n ; i++){
            if(piles[i]>maxPile){
                maxPile = piles[i];
            }
        }
        int low = 1;
        int high = maxPile;
        while(low<high){
            int mid = low+ (high-low)/2;
            if(canFinish(piles, h,mid) == true){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}