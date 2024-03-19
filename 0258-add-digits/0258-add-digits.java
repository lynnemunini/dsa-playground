class Solution {
    public int addDigits(int num) {
        String numStr = String.valueOf(num);

        while (numStr.length() != 1) {
            int sumOfDigits = 0;
            for (int i = 0; i < numStr.length(); i++) {
                sumOfDigits += numStr.charAt(i) - '0';
            }
            numStr = String.valueOf(sumOfDigits);
        }

        return Integer.parseInt(numStr);
    }
}