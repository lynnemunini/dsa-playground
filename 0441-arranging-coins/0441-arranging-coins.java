class Solution {
    public int arrangeCoins(int n) {
        var stairCaseCoins = 1;
        var usedCoins = 0;
        var stairCases = 0;

        while (n - usedCoins >= stairCaseCoins) {
            usedCoins+=stairCaseCoins;
            stairCaseCoins++;
            stairCases++;
        }

        return stairCases;
    }
}