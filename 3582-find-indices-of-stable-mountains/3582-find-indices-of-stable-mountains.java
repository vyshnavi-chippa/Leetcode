class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        int n=height.length;
        List<Integer>c=new ArrayList<>();
        int i;
        for(i=1;i<n;i++){
            if(height[i-1]>threshold){
                c.add(i);
            }
        }
        return c;
       // return a[];
    }
}