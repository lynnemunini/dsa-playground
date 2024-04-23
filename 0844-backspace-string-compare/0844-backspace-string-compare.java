class Solution {
    public boolean backspaceCompare(String s, String t) {
        var sStr = new StringBuilder();
        var tStr = new StringBuilder();

       for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                sStr.append(s.charAt(i));
            } else {
                if (!sStr.isEmpty()) sStr.deleteCharAt(sStr.length() - 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#') {
                tStr.append(t.charAt(i));
            } else {
                if (!tStr.isEmpty()) tStr.deleteCharAt(tStr.length() - 1);
            }
        }

        return sStr.compareTo(tStr) == 0;
    }
}