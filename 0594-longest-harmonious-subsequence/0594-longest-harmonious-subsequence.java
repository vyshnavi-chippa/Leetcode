class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            hs.add(nums[i]);
        }
        if(hs.size()==1)
        return 0;
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(Math.abs(nums[i]-nums[i+1])==1)
            max=Math.max(max,hm.get(nums[i])+hm.get(nums[i+1]));
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}