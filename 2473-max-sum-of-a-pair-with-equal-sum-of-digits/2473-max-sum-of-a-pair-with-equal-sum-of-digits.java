class Solution {
    public int SumDigit(int n){
        int sum=0,r=0;
        while(n!=0){
            r=n%10;
            sum+=r;
            n=n/10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=-1;
        for(int i:nums){
            int sum=SumDigit(i);
            if(map.containsKey(sum)){
                int num=map.get(sum);
                max=Math.max(max,i+num);
                map.put(sum,Math.max(num,i));
            }
            else{
                map.put(sum,i);
            }
        }
        return max;
    }
}