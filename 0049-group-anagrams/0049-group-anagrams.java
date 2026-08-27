class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 1){
            if(strs[0].equals("")) return new ArrayList<>(List.of(List.of("")));
            else return new ArrayList<>(List.of(List.of(strs[0])));
        }
        HashMap <String, ArrayList<String>> map = new HashMap<>();
        for(String s: strs){
            char[] str = s.toCharArray();
            Arrays.sort(str);
            if(!map.containsKey(String.valueOf(str))){
                map.put(String.valueOf(str), new ArrayList<>(List.of(s)));
            }
            else map.get(String.valueOf(str)).add(s);
        }
        List<List<String>> list = new ArrayList<>();
        for(String key: map.keySet()){
            ArrayList<String> list1 = map.get(key);
            list.add(list1);
        }
        return list;
    }
}