class Solution {
    public int firstUniqChar(String s) {
        List<Character> repeatingCharacters = new ArrayList<>();
        if (s.length() == 1) return 0;
        for (int i = 0; i < s.length(); i++) {
            var character = s.charAt(i);
            if (i == s.length() - 1) {
                if (!repeatingCharacters.contains(character)) return i;
            }
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == character) {
                    repeatingCharacters.add(character);
                    break;
                }
                if ((s.charAt(j) != character && j == s.length() - 1)) {
                    if (!repeatingCharacters.contains(character)) return i;
                }
            }
        }
        return -1;
    }
}