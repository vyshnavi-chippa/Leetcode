class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:amount)
        if(i!=0)
        pq.add(i);
        int c=0;
        while(!pq.isEmpty()){
            int a=pq.poll();
            if(pq.isEmpty()){
                c=c+a;
                return c;
            }
            int b=pq.poll();
            if(a!=1)
            pq.add(a-1);
            if(b!=1)
            pq.add(b-1);
            c++;
        }
        return c;
    }
}