class Solution {
    public String smallestPalindrome(String s) {
        if(s.length() == 1) return s;
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 97]++;
        }
        StringBuilder sb = new StringBuilder();
        boolean odd = false;
        char ch1 = '\0' ;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0 && freq[i] % 2 == 0){
                char ch = (char)('a' + i);
                int n = freq[i]/2;
                for(int j = 1; j <= n; j++)
                sb.append(ch);
            }
            else if(freq[i] % 2 != 0){
                odd = true;
                ch1 = (char)('a' + i);
                int n = freq[i]/2;
                for(int j = 1; j <= n; j++)
                sb.append(ch1);
            }
        }
          String first = sb.toString();
          String second = new StringBuilder(first).reverse().toString();
       return first + (ch1 == '\0' ? "" : ch1) + second;
    }
}