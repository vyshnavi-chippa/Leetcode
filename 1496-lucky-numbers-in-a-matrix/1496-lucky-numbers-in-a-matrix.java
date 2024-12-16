class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        
        List<Integer> l=new ArrayList<Integer>();
        int max=0,cmax=0,in=0,iin=0;
        for(int i=0;i<matrix.length;i++){
            int min=100001;
            for(int j=0;j<matrix[i].length;j++){
                
                if(min>matrix[i][j]){
                    iin=i;
                    in=j;
                    min=matrix[i][j];
                    max=min;
                }
            }
            int c=0;
            for(int k=0;k<matrix.length;k++){
               
                if(max>=matrix[k][in]){
                c++;
                if(c==matrix.length){
                    l.add(max);
                }
                }
                else{
                    break;
                }
                
            }
            
        }

        
        return l;
    }
}