class Solution {
    public double[] internalAngles(int[] arr) {
        double[] ans = new double[3];
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        if(a+b<=c) return new double[0];
        else if(b+c<=a) return new double[0];
        else if(c+a<=b) return new double[0];
        double p = ((a*a)+(b*b)-(c*c))/(double)(2*a*b);
        double q = ((c*c)+(b*b)-(a*a))/(double)(2*c*b);
        double r = ((a*a)+(c*c)-(b*b))/(double)(2*a*c);
        ans[0] = Math.acos(p)*(180)/Math.PI;
        ans[1] = Math.acos(q)*(180)/Math.PI;
        ans[2] = Math.acos(r)*(180)/Math.PI;
        Arrays.sort(ans);
        return ans;
    }
}