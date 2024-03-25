class Solution {
    public String reverseVowels(String s) {
        List<Character> vowelList = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int position = 0;
        StringBuilder sCopy = new StringBuilder(s);
        for (int i = s.length() - 1; i >= position; i--) {
            if (vowelList.contains(String.valueOf(s.charAt(i)).toLowerCase().charAt(0))) {
                for (int j = position; j < s.length(); j++) {
                    if (vowelList.contains(String.valueOf(s.charAt(j)).toLowerCase().charAt(0))) {
                        sCopy.setCharAt(i, s.charAt(j));
                        sCopy.setCharAt(j, s.charAt(i));
                        position = j + 1;
                        break;
                    }
                }
            }
        }
        return sCopy.toString();
    }
}