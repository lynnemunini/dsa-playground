class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> sList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            sList.add(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            if (!sList.contains(t.charAt(i))) {
               return t.charAt(i);
            } else {
                var index = sList.indexOf(t.charAt(i));
                sList.set(index, ' ');
            }
        }
        return ' ';
    }
}