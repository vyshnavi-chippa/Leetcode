class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums)
        pq.add(i);
        for(int i=0;i<k;i++){
            int x=pq.poll();
            int idx=0;
            for(int j=0;j<nums.length;j++){
                if(x==nums[j]){
                    idx=j;break;
                }
            }
            nums[idx]=multiplier*nums[idx];
            pq.add(nums[idx]);
        }
        return nums;
    }
}