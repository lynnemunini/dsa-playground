class Solution {
    public String longestCommonPrefix(String[] strs) {
        String baseStr = strs[0];
        for (String s : strs) {
            if (s.length() < baseStr.length()) {
                baseStr = s;
            }
        }

        StringBuilder common = new StringBuilder();
        for (int i = 0; i < baseStr.length(); i++) {
            char charVal = strs[0].charAt(i);
            boolean hasCommon = true;
            for (int j = 1; j < strs.length; j++) {
                hasCommon = strs[j].charAt(i) == charVal;
                if (!hasCommon) break;
            }
            if (hasCommon) {
                common.append(charVal);
            } else break;
        }
        return common.toString();
    }
}