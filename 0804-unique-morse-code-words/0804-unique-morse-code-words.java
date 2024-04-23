class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        List<String> morseAlphabet = new ArrayList<>(Arrays.asList(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."));
        List<String> morseWords = new ArrayList<>();
        Map<Character, Integer> alphabet = new HashMap<>();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < letters.length(); i++) {
            alphabet.put(letters.charAt(i), i + 1);
        }

        for (String word: words) {
            var morseWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                var position = alphabet.get(word.charAt(i)) - 1;
                morseWord.append(morseAlphabet.get(position));
            }
            morseWords.add(morseWord.toString());
        }
        
        var unique = new ArrayList<>();
        for (String s: morseWords) {
            if (!unique.contains(s)) {
                unique.add(s);
            }
        }
        return unique.size();
    }
}