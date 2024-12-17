class Solution {
    public int maxGoodNumber(int[] nums) {
        String [] str=new String[3];
        int num=0;
        for(int i=0;i<3;i++){
            str[i]=Integer.toBinaryString(nums[i]);
        }
        int max=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j==i)
                continue;
                for(int k=0;k<3;k++){
                    if(k==i||k==j)
                    continue;
                    String s=str[i]+str[j]+str[k];
                    num=Integer.parseInt(s,2);
                    if(num>max)
                    max=num;
                }
            }
        }
        return max;
    }
}