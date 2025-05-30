class Solution {
    public int minimumSum(int num) {
        int a[]=new int[4];
        int idx=0;
        while(num!=0){
            a[idx++]=num%10;
            num=num/10;
        }
        Arrays.sort(a);
        int sum=a[0]*10+a[2]+a[1]*10+a[3];
        return sum;
    }
}