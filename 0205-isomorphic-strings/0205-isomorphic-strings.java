class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            var key = s.charAt(i);
            if (!map.containsKey(key)) {
                if (!map.containsValue(t.charAt(i))) {
                    map.put(key, t.charAt(i));
                } else map.put(key, ' ');
            }
        }
        StringBuilder sStr = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            var character = s.charAt(i);
            var newChar = map.get(character);
            sStr.setCharAt(i, newChar);
        }

        return sStr.toString().equals(t);
    }
}