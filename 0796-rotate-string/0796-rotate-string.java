class Solution {
    public boolean rotateString(String s, String goal) {
        var shift = 0;
        var sb = new StringBuilder(s);
        while (shift < s.length()) {
            if (sb.toString().equals(goal)) {
                return true;
            }
            sb.deleteCharAt(0);
            sb.append(s.charAt(shift));
            shift++;
        }
        return false;
    }
}