class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        boolean valid = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        for (int num: nums) {
            if (num != nums[maxIndex]) {
                valid = num * 2 <= nums[maxIndex];
                if (!valid) break;
            }
        }

        if (valid) return maxIndex;
        return -1;
    }
}