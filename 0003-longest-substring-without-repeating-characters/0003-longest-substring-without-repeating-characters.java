class Solution {
    public int lengthOfLongestSubstring(String s) {
        //TIMESTAMP: 00:12:00
        int n = s.length();
        if(n == 0 || n == 1) return n;
        HashSet <Character> set = new HashSet<>();
        int i = 0, j = 0, max = 1;
        
        while(j < n){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
            }
            
            else {
                int count = j-i;
                if(count > max) max = count;
                while(s.charAt(i) != s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                
                i++;
                j++;
            }
        }
        int count = j-i;
        if(count > max) max = count;
        return max;
    }
}