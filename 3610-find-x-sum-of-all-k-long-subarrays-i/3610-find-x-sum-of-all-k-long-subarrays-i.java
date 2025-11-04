class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int ans[]=new int[nums.length-k+1];
        int idx=0;
        for(int i=0;i<nums.length-k+1;i++){
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int j=i;j<k+i;j++){
                hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            }
           // System.lout.println
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
            
            list.sort(
            Map.Entry.<Integer, Integer>comparingByValue(Comparator.reverseOrder())
                .thenComparing(Map.Entry.<Integer, Integer>comparingByKey(Comparator.reverseOrder()))
        );
            int c=0,sum=0;
            for(Map.Entry<Integer, Integer> e : list) {
                if(c<x){
                    sum+=e.getKey()*e.getValue();
                    c++;
                }
            System.out.println(e.getKey() + " = " + e.getValue());
        }
        System.out.println();
            ans[idx++]=sum;
        }
        return ans;
        
    }
}