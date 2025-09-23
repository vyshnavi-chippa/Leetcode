class Solution {
    public int compareVersion(String version1, String version2) {
        String st1[]=version1.split("\\.");
        String st2[]=version2.split("\\.");
        int max=Math.max(st1.length,st2.length);
        for(int i=0;i<max;i++){
            int a=0,b=0;
            if(i<st1.length)
            a=Integer.parseInt(st1[i]);
            if(i<st2.length)
            b=Integer.parseInt(st2[i]);
            if(a>b)
            return 1;
            else if(a<b)
            return -1;
        }
        return 0;
    }
}