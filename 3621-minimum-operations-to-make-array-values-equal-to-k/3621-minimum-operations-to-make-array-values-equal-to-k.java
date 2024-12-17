class Solution {
    public int minOperations(int[] nums, int k) {
        int s=0,c=0;
        Set<Integer> hs=new HashSet<>();
        for(int i:nums)
            hs.add(i);
        List<Integer> al=new ArrayList<>(hs);
        for(int i=0;i<al.size();i++){
            if(al.get(i)>k){
                s++;
            }
            if(al.get(i)<k)
                c++;
        }
        if(c>0)
            return -1;
        return s;
    }
}