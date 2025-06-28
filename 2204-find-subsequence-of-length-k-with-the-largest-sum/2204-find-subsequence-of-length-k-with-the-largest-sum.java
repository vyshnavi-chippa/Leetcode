class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        a[i]=nums[i];
        Arrays.sort(a);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=nums.length-k;i<nums.length;i++){
            pq.add(a[i]);
            System.out.print(a[i]+" ");
        }
        int ans[]=new int[k];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(idx==k)
            break;
            if(pq.contains(nums[i])){
            ans[idx]=nums[i];
            pq.remove(nums[i]);
            idx++;}
        }
        return ans;
    }
}