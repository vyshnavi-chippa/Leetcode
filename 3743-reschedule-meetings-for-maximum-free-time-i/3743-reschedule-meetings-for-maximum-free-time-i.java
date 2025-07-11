class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int c=0;
        int max=0;
        int a[]=new int[startTime.length+1];
        a[0]=startTime[0];
        for(int i=1;i<startTime.length;i++){
            a[i]=(startTime[i]-endTime[i-1]);
        }
        a[a.length-1]=eventTime-endTime[endTime.length-1];
        int window=k+1;


        for (int i=0;i<Math.min(window,a.length);i++) {
            c+=a[i];
        }
        max=c;
        for (int i=window; i<a.length; i++) {
            c+=a[i]-a[i-window];
            max=Math.max(max,c);
        }
        return max;
    }
}