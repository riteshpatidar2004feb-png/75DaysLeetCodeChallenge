class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int fr=0,fc=0,lr=matrix.length-1,lc=matrix[0].length-1;
        while(fr<=lr&&fc<=lc){
            for(int i=fc;i<=lc;i++) list.add(matrix[fr][i]);
            fr++;
            if(fc>lc||fr>lr) break;
            for(int i=fr;i<=lr;i++) list.add(matrix[i][lc]);
            lc--;
            if(fc>lc||fr>lr) break;
            for(int i=lc;i>=fc;i--) list.add(matrix[lr][i]);
            lr--;
             if(fc>lc||fr>lr) break;
            for(int i=lr;i>=fr;i--) list.add(matrix[i][fc]);
            fc++;
           if(fc>lc||fr>lr) break;
        }
        return list;
    }
}