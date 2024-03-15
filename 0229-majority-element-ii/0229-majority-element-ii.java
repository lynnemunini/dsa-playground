class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num: nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                var newVal = map.get(num);
                newVal++;
                map.replace(num, newVal);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 3) {
                list.add(entry.getKey());
            }
        }
        
        return list;
    }
}