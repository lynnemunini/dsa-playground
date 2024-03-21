class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (!charToWord.containsKey(ch)) {
                if (wordToChar.containsKey(word)) {
                    return false; // Word already mapped to a different character
                }
                charToWord.put(ch, word);
                wordToChar.put(word, ch);
            } else {
                if (!charToWord.get(ch).equals(word)) {
                    return false; // Character already mapped to a different word
                }
            }
        }

        return true;
    }

}