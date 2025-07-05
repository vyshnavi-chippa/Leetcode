class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==hm.get(arr[i]))
            ans=Math.max(ans,arr[i]);
        }
        return ans;
    }
}