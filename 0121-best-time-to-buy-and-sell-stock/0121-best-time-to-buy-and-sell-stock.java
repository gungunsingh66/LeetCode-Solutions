class Solution {
    public int maxProfit(int[] prices) {
        // int n = prices.length;
        // int cp = prices[0];
        // int max_profit = 0;
        // for(int i=1; i<n;i++){
        //     int curr_profit = prices[i]-cp;
        //     if(max_profit<curr_profit){
        //         max_profit = curr_profit;
        //     }
        //     if(prices[i]<cp){
        //         cp=prices[i];
        //     }

            
        // }
        // return max_profit;
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i = 1; i<prices.length;i++){
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}