class Solution {
    public double angleClock(int hour, int minutes) {
        double min=6.0*minutes;
        double hr=30.0*(hour % 12)+0.5*minutes;

        double dif=Math.abs(hr-min);

        return Math.min(dif,360.0-dif);
    }
}