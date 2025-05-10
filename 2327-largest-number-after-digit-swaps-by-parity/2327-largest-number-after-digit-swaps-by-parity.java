class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> pqO=new PriorityQueue<>(Collections.reverseOrder());
        String s=Integer.toString(num);
        int a[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            a[i]=Character.getNumericValue(s.charAt(i));
        }
        PriorityQueue<Integer> pqE=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
            pqE.add(a[i]);
            else
            pqO.add(a[i]);
        }

        String s2="";
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
            s2+=pqE.poll();}
            else{
            s2+=pqO.poll();}
        }

        int ans=Integer.parseInt(s2);
        return ans;
    }
}