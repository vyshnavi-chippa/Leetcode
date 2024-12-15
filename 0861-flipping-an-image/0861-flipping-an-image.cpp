class Solution {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {
        for(int i=0;i<image.size();i++){
            for(int j=0;j<image[i].size();j++){
                if(image[i][j]==1)
                image[i][j]=0;
                else
                image[i][j]=1;
            }
            int n=image.size();
            for(int k=0;k<image[i].size()/2;k++){
                int temp=image[i][k];
                image[i][k]=image[i][n-k-1];
                image[i][n-k-1]=temp;
            }
        }
        return image;
        
    }
};