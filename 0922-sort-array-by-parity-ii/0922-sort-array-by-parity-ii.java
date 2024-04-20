class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] sortedArray = new int[nums.length];
        var even = 0;
        var odd = 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                sortedArray[even] = num;
                even += 2;
            } else {
                sortedArray[odd] = num;
                odd += 2;
            }
        }
        return sortedArray;
    }
}