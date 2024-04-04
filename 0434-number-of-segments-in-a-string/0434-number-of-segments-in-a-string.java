class Solution {
    public int countSegments(String s) {
        var count = 0;
        var sList = s.split(" ");
        for (String string : sList) {
            if (!string.isBlank()) count++;
        }
        return count;
    }
}