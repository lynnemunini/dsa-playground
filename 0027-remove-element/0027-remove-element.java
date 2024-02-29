class Solution {
     public int removeElement(int[] nums, int val) {
        ArrayList<Integer> expectedNums = new ArrayList<>();
        for (int i : nums) {
            expectedNums.add(i);
        }
        expectedNums.removeIf(i -> (i == val));
        for (int i = 0; i < expectedNums.size(); i++) {
            nums[i] = expectedNums.get(i);
        }
        return expectedNums.size();
    }
}