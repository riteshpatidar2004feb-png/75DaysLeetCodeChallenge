class Solution {
    public List<String> generateParenthesis(int n) {
        List <String> list = new ArrayList<>();
        addparenthesis("", n, 0, 0, list);
        return list;
    }

    public void addparenthesis(String s, int n, int l, int r, List<String> list){
        if(s.length() == 2*n){
            list.add(s);
            return;
        }
        char ch = '\0';
        if(s.length() != 0) ch = s.charAt(s.length() - 1);
        if(s.length() == 0) {
            addparenthesis(s+"(", n, l+1, r, list);
            return;
        }
        else if(ch == ')' && l == r){
            addparenthesis(s+"(", n, l+1, r, list);
            return;
        }

        else if( ( ch == '(' || ch == ')' ) && l == n){
            addparenthesis(s+")", n, l, r+1, list);
            return;
        }

        else if( ch == '(' && l < n){
            addparenthesis(s+"(", n, l+1, r, list);
            addparenthesis(s+")", n, l, r+1, list);
            return;
        }

        else if( ch == ')' && l < n){
            addparenthesis(s+"(", n, l+1, r, list);
            addparenthesis(s+")", n, l, r+1, list);
            return;
        }
    }
}