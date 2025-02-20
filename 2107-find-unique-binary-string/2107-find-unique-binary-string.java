class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int a[]=new int[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            a[i]=Integer.parseInt(nums[i], 2);
        }
        Arrays.sort(a);
        int j=0;
        for(int i=0;i<a[a.length-1];i++){
            if(a[j++]!=i)
            return String.format("%"+nums.length+"s",Integer.toBinaryString(i)).replace(' ','0');
        }
        return String.format("%"+nums.length+"s",Integer.toBinaryString(a[a.length-1]+1)).replace(' ','0');
    }
}