class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> expectedNums = new ArrayList<>();
        for (int i : nums) {
            if (!expectedNums.contains(i)) {
                expectedNums.add(i);
                nums[expectedNums.indexOf(i)] = i;
            }
        }
        return expectedNums.size();
    }
}