class Solution {
    public int maximum69Number (int num) {
        var str = new StringBuilder(String.valueOf(num));
        for (int i = 0; i < str.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(str.charAt(i)));
            if (digit != 9) {
                str.setCharAt(i, '9');
                break;
            }
        }
        return Integer.parseInt(str.toString());
    }
}