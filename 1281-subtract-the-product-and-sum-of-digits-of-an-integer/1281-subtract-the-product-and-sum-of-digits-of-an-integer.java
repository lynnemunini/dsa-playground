class Solution {
    public int subtractProductAndSum(int n) {
        var str = String.valueOf(n);
        var sum = Integer.parseInt(String.valueOf(str.charAt(0)));
        var product = sum;
        for (int i = 1; i < str.length(); i++) {
            var digit = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum+=digit;
            product*=digit;
        }
        return product - sum;
    }
}