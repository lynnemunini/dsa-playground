class Solution {
     public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder(s.toLowerCase());
        StringBuilder strClean = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            var character = str.charAt(i);
            if (Character.isLetterOrDigit(character)) {
                strClean.append(character);
            }
        }
        return strClean.toString().equals(strClean.reverse().toString());
    }
}