class Solution {
    public int balancedStringSplit(String s) {
        char r = 'R';
        int count = 0;
        int rCount = 0;
        int lCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == r) {
                rCount++;
            } else lCount++;

            if (rCount == lCount) {
                count++;
                lCount = 0;
                rCount = 0;
            }
        }
        return count;
    }
}