class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            String s=Integer.toBinaryString(i);
            int c=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1')
                c++;
            }
            if(c==k)
            sum+=nums.get(i);
        }
        return sum;
    }
}