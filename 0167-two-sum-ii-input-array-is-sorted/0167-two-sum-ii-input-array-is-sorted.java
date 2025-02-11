class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1=0,p2=numbers.length-1;
        int a[]=new int[2];
        while(p1<p2){
            if(numbers[p1]+numbers[p2]>target){
                p2--;
            }
            else if(numbers[p1]+numbers[p2]<target)
            p1++;
            else{
                a[0]=p1+1;
                a[1]=p2+1;
                return a;
            }
        }
        return a;
    }
}