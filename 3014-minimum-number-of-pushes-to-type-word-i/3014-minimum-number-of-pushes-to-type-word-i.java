class Solution {
    public int minimumPushes(String word) {
        int cost = 0;
        for(int i = 0; i < word.length(); i++){
            if(i < 8) cost++;
            else if(i >=8 && i < 16) cost += 2;
            else if(i >= 16 && i < 24) cost += 3;
            else if(i >= 23 && i < 26) cost += 4;
        }
        return cost;
    }
}