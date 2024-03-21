class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        double result = n;
        
        while (result > 1) {
            result = result / 3;
            System.out.println(result);
        }
        
        return result == 1;
    }
}