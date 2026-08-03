class Solution {
    public int clumsy(int n) {
        if(n == 1 || n == 2) return n;
        ArrayList <Integer> list = new ArrayList <>();

        while( n > 0){
            if(n < 3){
                list.add(n);
                break;
            }

            int n1 = n * (n - 1) / (n - 2);
            list.add(n1);
            n = n - 3;
            if(n != 0) list.add(n);
            n--;
        }

    // Stack <Integer> st1 = new Stack <>();
    //  while(st.size() > 0){
    //     st1.push(st.pop());
    //  }
        
        int clumsy = list.get(0);
        boolean ekbaar = true;
        for(int i = 1; i < list.size(); i++){
            if(ekbaar){
                clumsy += list.get(i);
                ekbaar = false;
            }
            else {
                clumsy -= list.get(i);
                ekbaar = true;
            }
        }
        return clumsy;
    }
}