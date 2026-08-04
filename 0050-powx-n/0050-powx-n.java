class Solution {
    public double myPow(double x, int n) {
        int n1 = Math.abs(n);
        double pow = power1(x,n);
        // for(int i = 1; i <= e1; i++){
        //     pow = pow*b;
        // }
        
        if(n < 0) return (double)(1/pow);
        else return pow;
    }
    double power1(double b, int e1){
        if(e1 == 0) return 1;
        double powr = power1(b,e1/2);
        if(e1%2 == 0) return powr*powr;
        else return powr*powr*b;
    }
}