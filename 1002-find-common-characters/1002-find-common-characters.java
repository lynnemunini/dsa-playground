class Solution {
    public List<String> commonChars(String[] words) {
        var word = words[0];
        List<String> list = new ArrayList<>();
        List<String> wordsList = new ArrayList<>(Arrays.asList(words));

        for (int i = 0; i < word.length(); i++) {
            var isPresent = false;
            for (int j = 1; j < wordsList.size(); j++) {
                var str = new StringBuilder(wordsList.get(j));
                if (str.toString().contains(String.valueOf(word.charAt(i)))) {
                    isPresent = true;
                    str.deleteCharAt(str.toString().indexOf(word.charAt(i)));
                    wordsList.set(j, str.toString());
                } else {
                    isPresent = false;
                    break;
                }
            }
            if (isPresent) list.add(String.valueOf(word.charAt(i)));
        }

        return list;
    }
}