class Solution {
    public boolean isPerfectSquare(int num) {
        var result = String.valueOf(Math.sqrt(num)).split("\\.");

        for (int i = 0; i < result[1].length(); i++) {
            if (result[1].charAt(i) - '0' != 0) {
                return false;
            }
        }
        return true;
    }
}