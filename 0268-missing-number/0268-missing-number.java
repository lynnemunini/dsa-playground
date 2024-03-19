class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        var currentValue = nums[0];
        int missingNumber;

        if (nums[0] != 0) {
            missingNumber = nums[0] - 1;
            return missingNumber;
        } else missingNumber = nums[0] + 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != currentValue + 1) {
                missingNumber = currentValue + 1;
                break;
            } else missingNumber = nums[i] + 1;
            currentValue = nums[i];
        }
        return missingNumber;
    }
}