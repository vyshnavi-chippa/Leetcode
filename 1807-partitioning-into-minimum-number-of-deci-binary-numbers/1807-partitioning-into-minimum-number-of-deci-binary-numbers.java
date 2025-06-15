class Solution {
    public int minPartitions(String n) {
        char ch[]=n.toCharArray();
        int max=0;
        for(int i=0;i<n.length();i++){
            int num=Character.getNumericValue(ch[i]);
            if(max<num)
            max=num;
        }
        return max;
    }
}