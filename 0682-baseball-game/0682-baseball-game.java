class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        int score=0;
        list.add(score);
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                score=list.get(list.size()-1)+list.get(list.size()-2);
                list.add(score);
            }
            else if(operations[i].equals("D")){
                score=2*list.get(list.size()-1);
                list.add(score);
            }
            else if(operations[i].equals("C")){
                list.remove(list.size()-1);
            }
            else{
                list.add(Integer.parseInt(operations[i]));
            }
        }
        score=0;
        for(int i=0;i<list.size();i++) score+=list.get(i);
        return score;
    }
}