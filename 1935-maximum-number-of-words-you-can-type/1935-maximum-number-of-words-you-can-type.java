class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;

        for (String s : words) {
            boolean valid = false;
            for (char c : s.toCharArray()) {
                if (brokenLetters.contains(String.valueOf(c))) {
                    valid = false;
                    break;
                } else valid = true;
            }

            if (valid) count++;
        }

        return count;
    }
}