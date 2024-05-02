class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.replace(j, map.get(j) + 1);
            } else map.put(j, 1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        List<Integer> copy = new ArrayList<>(map.values());

        for (Integer temp : list) {
            copy.remove(copy.indexOf(temp));
            if (copy.contains(temp)) return false;
        }
        return true;
    }
}