class Solution {
   public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (i > 1) {
                if (c == s.charAt(i - 1) && c == s.charAt(i - 2)) {
                   continue;
                } else {
                    sb.append(c);
                }
            } else sb.append(c);

        }
        return sb.toString();
    }
}