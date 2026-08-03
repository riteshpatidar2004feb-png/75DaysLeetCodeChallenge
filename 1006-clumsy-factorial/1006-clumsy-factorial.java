class Solution {
    public int clumsy(int n) {
        if(n == 1 || n == 2) return n;
        Stack <Integer> st = new Stack <>();

        while( n > 0){
            if(n < 3){
                st.push(n);
                break;
            }

            int n1 = n * (n - 1) / (n - 2);
            st.push(n1);
            n = n - 3;
            if(n != 0) st.push(n);
            n--;
        }

    Stack <Integer> st1 = new Stack <>();
     while(st.size() > 0){
        st1.push(st.pop());
     }
        
        int clumsy = st1.pop();
        boolean ekbaar = true;
        while(st1.size() > 0){
            if(ekbaar){
                clumsy += st1.pop();
                ekbaar = false;
            }
            else {
                clumsy -= st1.pop();
                ekbaar = true;
            }
        }
        return clumsy;
    }
}