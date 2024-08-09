class Solution {
     public int findNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i: nums) {
            String s = String.valueOf(i);
            if (s.length() % 2 == 0) list.add(i);
        }

        return list.size();
    }
}