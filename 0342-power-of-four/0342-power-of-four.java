class Solution {
    public boolean isPowerOfFour(int n) {
        double result = n;
        while (result > 1) {
            result = result / 4;
        }
        return result == 1;
    }
}