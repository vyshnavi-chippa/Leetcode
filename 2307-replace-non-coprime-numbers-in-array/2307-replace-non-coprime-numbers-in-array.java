class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
       Stack<Long> st = new Stack<>();
        for (int num : nums) {
            long cur = num;
            while (!st.isEmpty()) {
                long g = gcd(st.peek(), cur);
                if (g > 1) {
                    cur = (st.pop() / g) * cur;
                } else break;
            }
            st.push(cur);
        }

        List<Integer> al = new ArrayList<>();
        for (long x : st) al.add((int)x);
        return al;
    }
    public long gcd(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}