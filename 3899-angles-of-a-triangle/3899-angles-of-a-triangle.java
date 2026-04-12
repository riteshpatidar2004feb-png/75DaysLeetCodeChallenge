class Solution {
    public double[] internalAngles(int[] sides) {
         int a=sides[0],b=sides[1],c=sides[2];
        if((a+b)<=c||(a+c)<=b||(c+b)<=a) return new double[0];
        double[] nums=new double[3];
        // if((a+b)>c&&(b+c)>a&&(c+a)>b){
            double A=((b*b+c*c-a*a)/(2.0*b*c));
            double B=((c*c+a*a-b*b)/(2.0*a*c));
            double C=((b*b-c*c+a*a)/(2.0*b*a));
            nums[0]=Math.acos(A)*180/Math.PI;
             nums[1]=Math.acos(B)*180/Math.PI;
             nums[2]=Math.acos(C)*180/Math.PI;
       // }
        Arrays.sort(nums);
        return nums;
    }
}