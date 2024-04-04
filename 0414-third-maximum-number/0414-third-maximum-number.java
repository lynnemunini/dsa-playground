class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num: nums) {
          if (!list.contains(num)) {
              list.add(num);
          }
        }

        list.sort(Collections.reverseOrder());

        if (list.size() < 3) return list.getFirst();
        else {
            list = list.subList(0, 3);
            return list.getLast();
        }
    }
}