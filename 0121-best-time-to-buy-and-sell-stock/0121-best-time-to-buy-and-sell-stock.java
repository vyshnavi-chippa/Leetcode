class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int p=0,pur=prices[0];
        for(int i=0;i<n;i++){
            if(pur>prices[i]){
                pur=prices[i];
            }
            if((prices[i]-pur)>p){
                p=prices[i]-pur;
            }
        }
        return p;
    }
}