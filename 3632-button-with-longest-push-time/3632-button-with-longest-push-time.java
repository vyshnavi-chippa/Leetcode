class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int m=events.length;
        int n=events[0].length;
        int max=events[0][1],k=events[0][0];
        for(int i=1;i<m;i++){
            
                int d=events[i][1]-events[i-1][1];
                int index=events[i][0];
                if(d>=max){
                    if(d==max&&k>index){
                        max=d;
                        k=index;
                    }
                    else if(d>max){
                        max=d;
                        k=index;
                    }
                
            }
        }
        return k;
    }
}