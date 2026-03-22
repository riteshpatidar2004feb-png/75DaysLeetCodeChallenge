class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] num=new int[2];
        int k=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if((numbers[i]+numbers[j])==target){
                    k=j;
                } 
            }
            if(k!=0){
                num[0]=i+1;
                num[1]=k+1;
                break;
            }
        }
        return num;
    }
}