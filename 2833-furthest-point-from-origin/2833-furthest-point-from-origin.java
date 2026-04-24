class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int r=0,l=0,sp=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='_') sp++;
            if(ch=='L') l++;
            if(ch=='R') r++;
        }
        if(l>r) return Math.abs(l+sp-r);
        if(r>l) return Math.abs(sp+r-l);
        return Math.abs(l-r+sp);
    }
}