class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int n = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(n > prices[i]){
                n = prices[i];
            }
            else{
                int prof = prices[i] - n;
                max = Math.max(max , prof);
            }
        }


        return max;
    }
}