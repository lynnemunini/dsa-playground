class Solution {
    public int[] twoSum(int[] nums, int target) {
        int val1Index = 0;
        while (val1Index < nums.length) {
            for (int i = val1Index + 1; i < nums.length; i++) {
                int val1 = nums[val1Index];
                int val2 = nums[i];
                if (val1 + val2 == target) {
                    return new int[]{val1Index, i};
                }
            }
            val1Index++;
        }
        return new int[]{};
    }
}