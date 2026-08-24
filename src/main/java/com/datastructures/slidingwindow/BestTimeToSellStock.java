package com.datastructures.slidingwindow;

public class BestTimeToSellStock {


    public int maxProfit(int[] prices) {
        int left = 0;
        int ans = 0;

        for(int right=0;right< prices.length;right++){
            while(prices[right] - prices[left] < 0){
                left++;
            }

            ans = Math.max(ans, prices[right]-prices[left]);
        }


        return ans;
    }
}
