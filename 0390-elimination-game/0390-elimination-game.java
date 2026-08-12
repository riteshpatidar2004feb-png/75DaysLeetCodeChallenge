class Solution {
    public int lastRemaining(int n) {
       return eliminate(1, 1, n, true);
    }

    public int eliminate(int head, int step, int remain, boolean left){
        if(remain == 1) return head;
        if(left){
            head = head + step;
            step = 2 * step;
            remain = remain/2;
            left = false;
        }
        else if(left == false && remain % 2 != 0){
            head = head + step;
            step = step*2;
            remain = remain/2;
            left = true;
        }
        else {
            step = step*2;
            remain = remain/2;
            left = true;
        }
        return eliminate(head, step, remain, left);
    }
}