class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int c[]=new int[101];
        for(int i=0;i<nums.size();i++){
            int s=nums.get(i).get(0);
            int e=nums.get(i).get(1);
            for(int j=s;j<=e;j++)
            c[j]++;
        }
        int cnt=0;
        for(int i=1;i<c.length;i++){
            if(c[i]>0)
            cnt++;
        }
        return cnt;
    }
}