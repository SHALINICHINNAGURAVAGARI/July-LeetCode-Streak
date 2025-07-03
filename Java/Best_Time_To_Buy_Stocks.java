class Solution {
    public static int maxProfit(int[] prices) {
        int buy_price=prices[0];//Initially we set but price to 0
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy_price){
                buy_price=prices[i];
            }else{
                int current_profit=prices[i]-buy_price;
                profit=Math.max(current_profit,profit);
            }
        }
        return profit;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]prices=new int[n];
        for(int i=1;i<n;i++){
            prices[i]=sc.nextInt();
        }
        System.out.print(maxProfit(prices));
    }
}