class Solution {
    public int mirrorDistance(int n) {
        int count=-1,n1=n;
        while(n1!=0){
            count++;
            n1/=10;
        }
        int place=1;
        for(int i=1;i<=count;i++) place=place*10;
        n1=n;
        int sum=0;
        while(n1!=0){
            int digit=n1%10;
            sum=sum+place*digit;
            place/=10;
            n1/=10;
        }
        return Math.abs(n-sum);
    }
}