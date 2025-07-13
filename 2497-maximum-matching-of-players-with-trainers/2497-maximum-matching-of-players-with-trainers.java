class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int p1=0,p2=0,c=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while(p1<players.length&&p2<trainers.length){
            if(players[p1]<=trainers[p2]){
                c++;
                p1++;p2++;
            }
            else{
                p2++;
            }
        }
        return c;
    }
}