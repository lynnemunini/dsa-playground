import java.math.BigInteger;
class Solution {
  public int[] plusOne(int[] digits) {
        StringBuilder digitsStr = new StringBuilder();
        for (int i: digits) {
            digitsStr.append(i);
        }

        BigInteger digitsInteger = new BigInteger(String.valueOf(digitsStr));
        var digitsPlusOne = digitsInteger.add(BigInteger.ONE);
        String digitsPlusOneStr = String.valueOf(digitsPlusOne);
        int[] digitsPlusOneArray = new int[digitsPlusOneStr.length()];

        for (int i = 0; i < digitsPlusOneStr.length(); i++) {
            digitsPlusOneArray[i] =Character.getNumericValue(digitsPlusOneStr.charAt(i));
        }
        
        return digitsPlusOneArray;
    }
}