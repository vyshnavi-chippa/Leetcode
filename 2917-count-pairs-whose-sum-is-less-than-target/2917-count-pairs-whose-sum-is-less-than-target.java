class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int size=nums.size();
        int c=0;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(nums.get(i)+nums.get(j)<target)
                c++;
            }
        }
        return c;
    }
}