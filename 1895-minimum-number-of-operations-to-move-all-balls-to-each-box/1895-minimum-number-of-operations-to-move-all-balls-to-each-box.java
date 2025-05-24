class Solution {
    public int[] minOperations(String boxes) {
        int a[]=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int sum=0;
            for(int j=0;j<boxes.length();j++){
                if(i!=j&&boxes.charAt(j)=='1'){
                    sum+=Math.abs(j-i);
                }
            }
            a[i]=sum;
        }
        return a;
    }
}