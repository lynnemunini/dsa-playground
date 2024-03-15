class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int num: nums) {
            list.add(num);
        }
        list.sort(Comparator.reverseOrder());
        return list.get(k - 1);
    }
}