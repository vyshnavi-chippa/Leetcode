class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int vmax=0,cmax=0;
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vmax=Math.max(hm.get(s.charAt(i)),vmax);
            }
            else
            cmax=Math.max(hm.get(s.charAt(i)),cmax);
        }
        return vmax+cmax;
    }
}