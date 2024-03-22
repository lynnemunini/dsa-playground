class Solution {
    public void reverseString(char[] s) {
        char[] sCopy = Arrays.copyOf(s, s.length);
        int reverseCount = s.length - 1;
        for (int i = 0; i < s.length; i++) {
            s[i] = sCopy[reverseCount];
            reverseCount--;
        }
    }
}