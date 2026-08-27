class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length()!=t.length()) return false;
        // char[] a1=s.toCharArray(),a2=t.toCharArray();
        // Arrays.sort(a1);
        // Arrays.sort(a2);
        // for(int i=0;i<s.length();i++) if(a1[i]!=a2[i]) return false;
        // return true;
        if(s.length()!=t.length()) return false;
        HashMap <Character, Integer> map = new HashMap<>();
        HashMap <Character, Integer> map1 = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch, freq+1);
            }
            else map.put(ch, 1);
        }
        
        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if(map1.containsKey(ch)){
                int freq = map1.get(ch);
                map1.put(ch, freq+1);
            }
            else map1.put(ch, 1);
        }
        for(int i = 0; i < s.length(); i++){
            int freq1 = map.get(s.charAt(i));
            if(map1.containsKey(s.charAt(i))){
                int freq2 = map1.get(s.charAt(i));
                if(freq1 != freq2) return false;
            }
            else return false;
        }
        return true;
    }
}