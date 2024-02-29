import java.math.BigInteger;
class Solution {
       public String addBinary(String a, String b) {
        var aInteger = new BigInteger(a, 2);
        var bInteger = new BigInteger(b, 2);
        var sumResult = aInteger.add(bInteger);
        return sumResult.toString(2);
    }
}