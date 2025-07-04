class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> al=new ArrayList<>();
        int c=0;
        while(c<nums.length){
            List<Integer> al2=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if(!al2.contains(nums[i])&&nums[i]!=0){
                    al2.add(nums[i]);
                    c++;
                    nums[i]=0;
                }
            }
            al.add(al2);
        }
        return al;
    }
}