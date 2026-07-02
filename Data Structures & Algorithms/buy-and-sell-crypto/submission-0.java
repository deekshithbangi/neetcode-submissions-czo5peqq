class Solution {
    public int maxProfit(int[] prices) {
        int lowestP = 100; 
        int maxP = 0; 
        for (int price : prices) { 
            if (price < lowestP) lowestP = price; 
            maxP = Math.max(maxP, price - lowestP); 
        } 
        return maxP; 
    }
}
