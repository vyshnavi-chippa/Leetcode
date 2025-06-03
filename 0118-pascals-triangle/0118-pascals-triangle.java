class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        al.add(l1);
        if(numRows==1)
        return al;
        for(int j=1;j<numRows;j++){
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<l1.size()+1;i++){
            if(i==0||i==l1.size()){
                l2.add(1);
            }
            else{
                l2.add(l1.get(i-1)+l1.get(i));
            }
        }
        l1=l2;
        al.add(l1);
        }
        return al;
    }
}