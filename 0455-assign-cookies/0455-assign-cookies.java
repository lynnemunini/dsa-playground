class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        var count = 0;
        var position = 0;
        for (int i : g) {
            for (int j = position; j < s.length; j++) {
                if (s[j] >= i) {
                    count++;
                    position = j + 1;
                    break;
                }
            }
        }
        return count;
    }
}