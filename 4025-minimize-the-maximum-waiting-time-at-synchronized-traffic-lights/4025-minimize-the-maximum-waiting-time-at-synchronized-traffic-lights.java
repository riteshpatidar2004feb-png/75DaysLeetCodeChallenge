class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        //Arrays.sort(lights);
        int max_l= Integer.MIN_VALUE;
        for(int i = 0; i < lights.length; i++) {
            if(max_l < lights[i]) max_l = lights[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arrivalTime.length; i++){
            int r = arrivalTime[i] % period;
            int wt = 0;
            if(r >= max_l){
                wt = period - r;
            }
            if(wt > max) max = wt;
        }
        return max;
    }
}