class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<gifts.length;i++){
            pq.add(-1*gifts[i]);
        }
        for(int i=0;i<k;i++){
            pq.add(-1*(int)Math.sqrt(-1*pq.poll()));
        }
        long ans=0;
        for(int i:pq)
        ans+=(-1*i);
        return ans;    
    }
}