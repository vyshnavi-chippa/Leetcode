class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        pq.add(-1*nums[i]);
        int n=-1*pq.poll();
        int m=-1*pq.poll();
        return (n-1)*(m-1);
    }
}