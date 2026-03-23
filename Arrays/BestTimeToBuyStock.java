public class BestTimeToBuyStock {
    public static int maxProfit(int[] prices) {
        int low = prices[0];
        int ans = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < low){
                low = prices[i];
            }
            int profit = prices[i] - low;
            ans = Math.max(ans, profit);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit(prices2));
    }

}
