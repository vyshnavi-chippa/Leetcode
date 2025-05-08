class Solution {
    public String[] findRelativeRanks(int[] score) {
        String a[]=new String[score.length];
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i:score){
            ts.add(-1*i);
        }
        TreeMap<Integer,String> tm=new TreeMap<>();
        int idx=1;
        for(int val:ts){
            tm.put(val,idx+"");
            idx++;
        }

        for(int i=0;i<score.length;i++){
            if("1".equals(tm.get(-1*score[i]))){
                a[i]="Gold Medal";
            }
            else if("2".equals(tm.get(-1*score[i])))
            a[i]="Silver Medal";
            else if("3".equals(tm.get(-1*score[i])))
            a[i]="Bronze Medal";
            else
            a[i]=tm.get(-1*score[i]);
        }
        return a;
    }
}