class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int c[]=new int[n];
        Arrays.fill(c,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1])
            c[i]=c[i-1]+1;
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                c[i]=Math.max(c[i+1]+1,c[i]);
            }
        }
        int ans=0;
        for(int i:c)
        ans+=i;
        return ans;

    }
}