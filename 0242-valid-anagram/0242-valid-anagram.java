class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            var sChar = s.charAt(i);
            var tChar = t.charAt(i);

            if (sMap.containsKey(sChar)) {
                sMap.replace(sChar, sMap.get(sChar) + 1);
            } else sMap.put(sChar, 1);

            if (tMap.containsKey(tChar)) {
                tMap.replace(tChar, tMap.get(tChar) + 1);
            } else tMap.put(tChar, 1);
        }
        
        return sMap.equals(tMap);
    }
}