class Solution {
    public boolean checkPerfectNumber(int num) {
        var result = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) result+=i;
        }        
        return result == num;
    }
}