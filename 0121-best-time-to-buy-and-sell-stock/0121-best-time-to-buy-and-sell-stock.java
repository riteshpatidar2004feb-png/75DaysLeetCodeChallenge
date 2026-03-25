class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
         int maxProfit=0,minprice=prices[0],n=prices.length;
         for(int i=1;i<n;i++){
            int price=prices[i];
            if(minprice>price) minprice=price;
            int profit=prices[i]-minprice;
            if(profit>maxProfit) maxProfit=profit;
         }
         return maxProfit;
    }
}