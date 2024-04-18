class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder word = new StringBuilder();

        for (char c : paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
               word.append(String.valueOf(c).toLowerCase());
            } else {
                if (Arrays.asList(banned).contains(word.toString()) || word.isEmpty()) {
                    word.setLength(0);
                    continue;
                }
                if (!map.containsKey(word.toString())) {
                    map.put(word.toString(), 1);
                } else map.replace(word.toString(), map.get(word.toString()) + 1);
                word.setLength(0);
                continue;
            }
            if (paragraph.indexOf(c) == paragraph.length() - 1) {
                if (!map.containsKey(word.toString())) {
                    map.put(word.toString(), 1);
                } else map.replace(word.toString(), map.get(word.toString()) + 1);
            }
        }

        var common = 0;
        var commonKey = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > common) {
                common = entry.getValue();
                commonKey = entry.getKey();
            }
        }

        return commonKey;
    }
}