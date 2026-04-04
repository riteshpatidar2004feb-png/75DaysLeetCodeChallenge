class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<=rowIndex;i++){
            list.add(new ArrayList<>());
            int j=1;
            list.get(i).add(0,1);
             int k=0;
            while(j<i){
                list.get(i).add(j,list.get(i-1).get(k)+list.get(i-1).get(k+1));
                k++;
                j++;
            }
            if(i>0) list.get(i).add(i,1);
        }
        return list.get(rowIndex);
    }
}