class Solution {
    public int findPairs(int[] arr, int k) {
        int count = 0;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i], freq+1);
            }
            else map.put(arr[i], 1);
        }
        if(k != 0){
            for(int key: map.keySet()){
               
                int diff1 = key - k;
                int diff2 = key + k;
                if(map.containsKey(diff1))
                    count++;
                if(map.containsKey(diff2))
                    count++;
            }
        }
        else{
            for(int key: map.keySet()){
                
                    int freq = map.get(key);
                    if(freq > 1) count++;
            }
            return count;
        }
        return count/2;
    }
}