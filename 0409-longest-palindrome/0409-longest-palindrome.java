class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int palindromeLength = 0;
        boolean hasOddFrequency = false;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else map.put(s.charAt(i), 1);
        }

        for (int freq : map.values()) {
            palindromeLength += freq / 2 * 2;
            if (freq % 2 == 1) {
                hasOddFrequency = true;
            }
        }

        if (hasOddFrequency) {
            palindromeLength++;
        }
        return palindromeLength;
    }
}