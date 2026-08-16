class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        Arrays.sort(lights);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arrivalTime.length; i++){
            int r = arrivalTime[i] % period;
            int wt = 0;
            if(r >= lights[lights.length-1]){
                wt = period - r;
            }
            if(wt > max) max = wt;
        }
        return max;
    }
}