class Solution {
    public boolean isSubsequence(String s, String t) {
        int position = 0;
        List<Character> sList = new ArrayList<>();
        List<Character> tList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            sList.add(s.charAt(i));
            for (int j = position; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    tList.add(t.charAt(j));
                    position = j + 1;
                    break;
                }
            }
        }

        return sList.equals(tList);
    }
}