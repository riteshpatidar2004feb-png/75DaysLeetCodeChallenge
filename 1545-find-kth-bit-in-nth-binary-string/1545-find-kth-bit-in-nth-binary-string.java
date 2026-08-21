class Solution {
    public char findKthBit(int n, int k) {
        String s = "0";
        if(n == 1) return s.charAt(k-1);
        return creatstring("", s, n).charAt(k-1);
    }

    public String creatstring(String emp, String s, int i){
        if(i == 1) return s;
        emp = s + "1" + reverse(s);
        return creatstring("", emp, i - 1);
    }

    public String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == '1') sb.append("0");
            else sb.append("1");
        }
        return sb.toString();
    }
}