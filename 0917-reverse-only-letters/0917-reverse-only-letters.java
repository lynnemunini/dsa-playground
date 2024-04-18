class Solution {
    public String reverseOnlyLetters(String s) {
        var newS = new StringBuilder(s);
        var left  = 0;
        var right = s.length() - 1;
        var i = 0;

        while (i < s.length()) {
            if (Character.isLetter(s.charAt(left))) {
                if (Character.isLetter(s.charAt(right))) {
                    var temp = s.charAt(left);
                    newS.setCharAt(left, s.charAt(right));
                    newS.setCharAt(right, temp);
                    left++;
                }
                right--;
            } else left++;
            i++;
        }

        return newS.toString();
    }
}