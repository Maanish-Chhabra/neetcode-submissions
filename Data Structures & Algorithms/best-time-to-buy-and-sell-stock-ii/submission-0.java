class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0],maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice) minPrice=prices[i];
            if(prices[i]-minPrice>0){
                maxProfit+=prices[i]-minPrice;
                minPrice=prices[i];
            }
        }
        return maxProfit;
    }
}