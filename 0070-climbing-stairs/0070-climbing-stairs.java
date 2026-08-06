class Solution {
    public int climbStairs(int n) {
        return stair(n, 0, 1) + 1;
    }
    public int stair(int n, int term1, int term2){
        if(n == 0) return 0;
        int sum = term1 + stair(n-1, term2, term1+term2);
        return sum;
    }
}