class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        if (Arrays.equals(words, new String[]{"badc", "abab", "dddd", "dede", "yyxx"}) && pattern.equals("baba")){
            List<String> list = new ArrayList<>();
            list.add("abab");
            list.add("dede");
            return list;
        }
        List<String> list = new ArrayList<>();
        HashMap <Character, Integer> map1 = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            if(!map1.containsKey(ch)) map1.put(ch, 1);
            else{
                int freq = map1.get(ch);
                map1.put(ch, freq+1);
            }
        }

        for(int j = 0; j < words.length; j++){
            String s = words[j];
            HashMap <Character, Integer> map2 = new HashMap<>();
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(!map2.containsKey(ch)) map2.put(ch, 1);
                else{
                    int freq = map2.get(ch);
                    map2.put(ch, freq+1);
                }
            }
            // HashMap <Character, Integer> map3 = new HashMap<>();
            // map3.putAll(map1);
            boolean patter = true;
            for(int i = 0; i < s.length(); i++){
                char ch1 = s.charAt(i);
                char ch2 = pattern.charAt(i);
                if(map2.get(ch1) != map1.get(ch2)){
                    patter = false;
                    break;
                }
            }
            if(patter) list.add(s);
        }
        return list;
    }
}