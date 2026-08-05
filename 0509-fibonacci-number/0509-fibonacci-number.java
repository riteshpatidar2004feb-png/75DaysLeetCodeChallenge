class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        // int[] num=new int[n+1];
        // int fibo=0;
        // if(n==0) fibo=0;
        // else if(n==1||n==2){ 
        //     fibo=1;
        // }
        // else{
        //     num[0]=0;
        //     num[1]=1;
        //     for(int i=2;i<=n;i++){    
        //         num[i]=num[i-1]+num[i-2];
        //         fibo=num[i];        
        // }
        // }
        // return fibo;
        return fibo(n, 0, 1);
    }
    public int fibo(int n, int term1, int term2){
        if(n == 2) return term1 + term2;
        int sum = fibo(n-1, term2, term1+term2);
        return sum;
    }
}