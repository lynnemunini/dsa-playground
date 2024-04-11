class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.replace(word, map.get(word) + 1);
            } else map.put(word, 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((entry1, entry2) -> {
            int valueComparison = entry2.getValue().compareTo(entry1.getValue());
            if (valueComparison == 0) {
                return entry1.getKey().compareTo(entry2.getKey());
            }
            return valueComparison;
        });

        for (int i = 0; i < k; i++) {
            result.add(list.get(i).getKey());
        }

        return result;
    }
}