class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i=i+2){
            int f=nums[i];
            int v=nums[i+1];
            for(int j=0;j<f;j++){
                al.add(v);
            }
        }
        int a[]=new int[al.size()];
        for(int i=0;i<al.size();i++)
        a[i]=al.get(i);
        return a;
    }
}