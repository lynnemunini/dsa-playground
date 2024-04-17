class Solution {
    public boolean detectCapitalUse(String word) {
        var lowerCasePosition = 0;
        var upperCasePosition = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                if (upperCasePosition != 0 && upperCasePosition != 1) return false;
                lowerCasePosition = i + 1;
            } else {
                upperCasePosition = i + 1;
                if (lowerCasePosition != 0) return false;
            }
        }
        return true;
    }
}