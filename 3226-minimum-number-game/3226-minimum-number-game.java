class Solution {
    public int[] numberGame(int[] nums) {
       
       PriorityQueue<Integer> pq=new PriorityQueue<>();
       for(int i:nums)
       pq.add(i);
       int idx=0;
       while(!pq.isEmpty()){
        int a=pq.poll();
        int b=pq.poll();
        nums[idx++]=b;
        nums[idx++]=a;
       } 
       return nums;
    }
}