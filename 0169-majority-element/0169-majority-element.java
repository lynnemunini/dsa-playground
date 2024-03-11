class Solution {
      public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) continue;
            var count = 0;
            for (int j : nums) {
                if (i == j) {
                    count++;
                }
            }
            map.put(i, count);
        }

        int maxKey = map.keySet().iterator().next();
        int maxValue = map.get(maxKey);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > maxValue) {
                maxValue = value;
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}