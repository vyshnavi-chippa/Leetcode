class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m=img.length;
        int n=img[0].length;
        int mat[][]=new int[m][n];
        for(int i=0;i<img.length;i++){
            for(int j=0;j<img[i].length;j++){
                int sum=0,c=0;
                for(int k=i-1;k<i+2;k++){
                    if(k<0||k>=img.length)
                    continue;
                    else{
                    for(int l=j-1;l<j+2;l++){
                        if(l<0||l>=img[0].length){
                            continue;
                        }
                        else{
                            sum+=img[k][l];
                            c++;
                        }
                    }}
                }
              // int f=(int)Math.floor(sum/c);
                mat[i][j]=sum/c;
            }
        }
        return mat;
    }
}