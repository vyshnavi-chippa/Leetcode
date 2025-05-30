class Solution {
    public int numberOfBeams(String[] bank) {
        ArrayList<Integer> al=new ArrayList<>(bank.length);
        for(int i=0;i<bank.length;i++){
            int s=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1')
                s+=1;
            }
            if(s!=0){
                al.add(s);
            }

        }
        int ans=0;
        for(int i=0;i<al.size()-1;i++){
            int sum=al.get(i)*al.get(i+1);
            ans+=sum;
        }
        return ans;
    }
}