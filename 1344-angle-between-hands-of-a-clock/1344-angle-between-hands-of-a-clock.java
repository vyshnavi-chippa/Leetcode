class Solution {
    public double angleClock(int hour, int minutes) {

        double ans=Math.abs(30*hour-(11.0/2)*minutes);

        return Math.min(ans,360.0-ans);
    }
}