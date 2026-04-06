class Solution {
    public int mirrorFrequency(String s) {
         char[] s1=s.toCharArray();
        Arrays.sort(s1);
        int j=-1;
        for(int i=0;i<s1.length;i++){
            if(s1[i]<='9'&&s1[i]>='0') j++;
            else break;
        }
        int i=0,j1=j,count=0;
        while(i<=j1){
            if((s1[i]-'0')+(s1[j1]-'0')==9){
                 count ++;i++;j1--;
            }
            else  if((s1[i]-'0')+(s1[j1]-'0')<9) i++;
            else j1--;
        }
        i=j+1;j=s1.length-1;
        while(i<=j){
            if((s1[i]-'a'+1)+(s1[j]-'a'+1)==27){
                 count ++;i++;j--;
            }
            else if((s1[i]-'a'+1)+(s1[j]-'a'+1)<27) i++;
           else j--;
        }
        return s.length()-2*count;
    }
}