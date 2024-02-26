class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        StringBuilder reverseStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i --) {
            reverseStr.append(str.charAt(i));
        }
        return str.contentEquals(reverseStr);
    }
}