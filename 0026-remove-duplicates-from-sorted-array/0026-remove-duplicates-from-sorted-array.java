class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i:nums)
        set.add(i);
        int index=0;
        for(int i:set){
            nums[index++]=i;
        }
        return set.size();
    }
}