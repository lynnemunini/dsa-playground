class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        var threeOdds = false;
        var count = 0;

        for (int j : arr) {
            if (j % 2 != 0) {
                threeOdds = true;
                count++;
            } else {
                if (count >= 3) break;
                else {
                    count = 0;
                    threeOdds = false;
                }
            }
        }

        if (count >= 3) return threeOdds;
        return false;
    }
}