class Solution {
    public int maxDistance(String str, int k) {
        int n=0,s=0,w=0,e=0,dist=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N')
            n++;
            else if(str.charAt(i)=='S')
            s++;
            else if(str.charAt(i)=='W')
            w++;
            else
            e++;
            int d=Math.abs(n-s)+Math.abs(w-e)+2*k;
            dist=Math.max(dist,Math.min(d,i+1));
        }
        return dist;
    }
}