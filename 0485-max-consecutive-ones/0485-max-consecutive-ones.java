class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        var count = 0;
        var countConsecutive = 0;
        for (int num : nums) {
            if (num == 1) {
                countConsecutive++;
                if (countConsecutive > count) {
                    count = countConsecutive;
                }
            } else {
                countConsecutive = 0;
            }
        }
        return count;
    }
}