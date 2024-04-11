class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder aStr = new StringBuilder();
        var count = 0;

        while (aStr.length() <= b.length() + a.length()) {
            aStr.append(a);
            count++;
            if (aStr.indexOf(b) != -1 ) return count;
        }
        return -1;
    }
}