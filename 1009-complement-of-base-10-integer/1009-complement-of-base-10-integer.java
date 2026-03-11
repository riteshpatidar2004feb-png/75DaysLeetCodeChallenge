class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int sum=0,i=0;
        while(n!=0){
            int bit=n%2;
            if(bit==0){
                sum=sum+(int)Math.pow(2,i);
                i++;
            }
            else i++;
            n/=2;
        }
        return sum;
    }
}