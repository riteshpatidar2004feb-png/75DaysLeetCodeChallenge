class Solution {
    public String countAndSay(int n) {
        //gfg timestamp : 03:30:00
        if( n == 1) return "1";
        String s = countAndSay(n-1);
        String ans = "";
        int i = 0, j = 1, count = 1;
        char ch = s.charAt(i);
        while(i < s.length()){
            if(j < s.length() && ch == s.charAt(j)) {
                j++;
                count++;
            }
            else{
                ans = ans + (char)(count+'0') + ch;
                if(j < s.length()){
                    i = j;
                    j = i+1;
                    count = 1;
                    ch = s.charAt(i);
                }
                else break;
            }
        }
        return ans;
    }
}