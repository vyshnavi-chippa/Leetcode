class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i=0;i<candies.length;i++)
            if(max<candies[i])
                max=candies[i];
        ArrayList<Boolean> al=new ArrayList<>(candies.length);
        for(int i=0;i<candies.length;i++){
            al.add(candies[i]+extraCandies>=max);
        }
        return al;
    }
}