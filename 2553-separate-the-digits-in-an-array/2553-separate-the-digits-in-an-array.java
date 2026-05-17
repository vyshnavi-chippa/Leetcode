class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            ArrayList<Integer> al2=new ArrayList<>(); 
            while(n!=0){
                al2.add(n%10);
                n=n/10;
            }
            while(al2.size()!=0){
                al.add(al2.get(al2.size()-1));
                al2.remove(al2.size()-1);
            }
        }
        return al.stream().mapToInt(Integer::intValue).toArray();
    }
}