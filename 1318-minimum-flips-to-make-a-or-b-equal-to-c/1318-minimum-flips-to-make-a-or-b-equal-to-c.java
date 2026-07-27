class Solution {
    public int minFlips(int a, int b, int c) {
        int count = 0;
        while( (a|b) != c){
            if(c % 2 == 1){
                if(a % 2 == 0 && b % 2 == 0) count++;
            }
            else{
                if(a % 2 != 0) count++;
                if(b % 2 != 0) count++;
            }
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        return count;
    }
}